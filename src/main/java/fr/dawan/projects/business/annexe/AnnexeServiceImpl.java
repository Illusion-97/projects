package fr.dawan.projects.business.annexe;

import fr.dawan.projects.business.annexe.exceptions.FileStorageException;
import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
@Transactional
public class AnnexeServiceImpl extends AbstractGenericService<Annexe, AnnexeDto, AnnexeRepository, AnnexeMapper> implements AnnexeService {


    private Path apiFilePath;

    public AnnexeServiceImpl(AnnexeRepository repository, AnnexeMapper mapper, @Value("${APPLICATION_STORAGE_VOLUME}") String filePath) {
        super(repository, mapper);
        apiFilePath = Paths.get(filePath).toAbsolutePath().normalize();

        try {
            Files.createDirectories(apiFilePath);
        } catch (IOException e) {
            throw new FileStorageException("Impossible de créer le dossier au chemin " + filePath);
        }
    }

    @Override
    public Annexe saveFile(MultipartFile file, String fileName) {
        try {
            Annexe annexe = new Annexe(fileName, getExtension(fileName), file.getContentType());
            annexe = repository.saveAndFlush(annexe);
            Path targetLocation = apiFilePath.resolve(annexe.getId() +"." + annexe.getExtension()); // C:/shared/filename
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return annexe;
        } catch (IOException ex) {
            throw new FileStorageException("Impossible de sauvegarder " + fileName);
        }
    }

    private String getExtension(String name) {
        String[] split = name.split("\\.");
        return split[split.length - 1];
    }

    @Override
    public Resource load(String fileName) { // Retrouver C:/shared/filename
        try {
            Path file = apiFilePath.resolve(fileName);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new FileStorageException("Impossible de lire le fichier " + fileName);
            }
        } catch (MalformedURLException e) {
            throw new FileStorageException("Le fichier n'est pas présent dans le stockage");
        }
    }
}

package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.business.annexe.Annexe;
import fr.dawan.projects.business.annexe.AnnexeService;
import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class DossierProjetServiceImpl extends AbstractGenericService<DossierProjet, DossierProjetDto, DossierProjetRepository, DossierProjetMapper> implements DossierProjetService {

    private final AnnexeService annexeService;
    public DossierProjetServiceImpl(DossierProjetRepository repository, DossierProjetMapper mapper, AnnexeService annexeService) {
        super(repository, mapper);
        this.annexeService = annexeService;
    }

    @Override
    public void addAnnexe(long dossierId, MultipartFile file) {
        String name = file.getName();
        repository.findById(dossierId).ifPresent(existing -> {
            Annexe annexe = annexeService.saveFile(file,name);
            existing.getAnnexes().add(annexe);
            repository.saveAndFlush(existing);
        });
    }
}

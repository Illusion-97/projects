package fr.dawan.projects.business.annexe;

import fr.dawan.projects.generic.GenericService;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface AnnexeService extends GenericService<AnnexeDto> {
    Annexe saveFile(MultipartFile file, String fileName);

    Resource load(String fileName);
}

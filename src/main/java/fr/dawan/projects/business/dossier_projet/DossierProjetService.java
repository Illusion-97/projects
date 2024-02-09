package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.generic.GenericService;
import org.springframework.web.multipart.MultipartFile;

public interface DossierProjetService extends GenericService<DossierProjetDto> {
    void addAnnexe(long dossierId, MultipartFile file);
}

package fr.dawan.projects.business.resume;

import fr.dawan.projects.business.dossier_projet.DossierProjet;
import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResumeServiceImpl extends AbstractGenericService<Resume, ResumeDto, ResumeRepository, ResumeMapper> implements ResumeService {
    public ResumeServiceImpl(ResumeRepository repository, ResumeMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResumeDto findByDossier_IdAndLangue(Long id, Langue langue) {
        return mapper.toDto(repository.findByDossier_IdAndLangue(id, langue)
                //.orElse(createByDossierAndLangue(id, langue)) Sera exécuté dans tous les cas en tant que préparatif AU CAS OU on ne trouverais pas de valeur
                .orElseGet(() -> createByDossierAndLangue(id, langue))); // Supplier (pas de parametre en etrée mais retourne une valeur) est une methode qui sera exécutée apres vérification

    }

    private Resume createByDossierAndLangue(Long dossierId, Langue langue) {
        Resume resume = new Resume();
        resume.setLangue(langue);
        DossierProjet dossier = new DossierProjet();
        dossier.setId(dossierId);
        resume.setDossier(dossier);
        return repository.save(resume);
    }
}

package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DossierProjetServiceImpl extends AbstractGenericService<DossierProjet, DossierProjetDto, DossierProjetRepository, DossierProjetMapper> implements DossierProjetService {
    public DossierProjetServiceImpl(DossierProjetRepository repository, DossierProjetMapper mapper) {
        super(repository, mapper);
    }
}

package fr.dawan.projects.business.projet;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjetServiceImpl extends AbstractGenericService<Projet, ProjetDto, ProjetRepository, ProjetMapper> implements ProjetService {
    public ProjetServiceImpl(ProjetRepository repository, ProjetMapper mapper) {
        super(repository, mapper);
    }
}

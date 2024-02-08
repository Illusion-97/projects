package fr.dawan.projects.business.projet;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class ProjetServiceImpl extends AbstractGenericService<Projet, ProjetDto, ProjetRepository, ProjetMapper> implements ProjetService {
    public ProjetServiceImpl(ProjetRepository repository, ProjetMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public void addContent(long id) {
        /*Optional<Projet> byId = repository.findById(id);
        if(byId.isPresent()) {
            Projet existing = byId.get();
            existing.getContenus().add("");
            repository.saveAndFlush(existing);
        }*/
        repository.findById(id).ifPresent(existing -> {
            existing.getContenus().add("Default Value");
            repository.saveAndFlush(existing);
        });
    }
}

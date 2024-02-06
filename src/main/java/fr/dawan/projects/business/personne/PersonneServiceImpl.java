package fr.dawan.projects.business.personne;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonneServiceImpl extends AbstractGenericService<Personne,PersonneDto,PersonneRepository,PersonneMapper> implements PersonneService {
    public PersonneServiceImpl(PersonneRepository repository, PersonneMapper mapper) {
        super(repository, mapper);
    }
}

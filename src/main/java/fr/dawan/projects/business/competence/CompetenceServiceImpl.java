package fr.dawan.projects.business.competence;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompetenceServiceImpl extends AbstractGenericService<Competence, CompetenceDto, CompetenceRepository, CompetenceMapper> implements CompetenceService {
    public CompetenceServiceImpl(CompetenceRepository repository, CompetenceMapper mapper) {
        super(repository, mapper);
    }
}

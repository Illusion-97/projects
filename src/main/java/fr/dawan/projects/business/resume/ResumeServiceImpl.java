package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResumeServiceImpl extends AbstractGenericService<Resume, ResumeDto, ResumeRepository, ResumeMapper> implements ResumeService {
    public ResumeServiceImpl(ResumeRepository repository, ResumeMapper mapper) {
        super(repository, mapper);
    }
}

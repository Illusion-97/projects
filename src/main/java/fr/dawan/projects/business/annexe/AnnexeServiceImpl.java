package fr.dawan.projects.business.annexe;

import fr.dawan.projects.generic.AbstractGenericService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AnnexeServiceImpl extends AbstractGenericService<Annexe, AnnexeDto, AnnexeRepository, AnnexeMapper> implements AnnexeService {
    public AnnexeServiceImpl(AnnexeRepository repository, AnnexeMapper mapper) {
        super(repository, mapper);
    }
}

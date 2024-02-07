package fr.dawan.projects.business.competence;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/competences")
public class CompetenceRestController extends AbstractGenericRestController<CompetenceDto, CompetenceService> {
    public CompetenceRestController(CompetenceService service) {
        super(service);
    }
}

package fr.dawan.projects.business.competence;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("competences")
public class CompetenceController extends AbstractController<CompetenceDto, CompetenceService> {

    public CompetenceController(CompetenceService service) {
        super("competences", service);
    }
}

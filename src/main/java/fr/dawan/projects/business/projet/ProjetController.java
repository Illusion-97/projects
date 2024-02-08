package fr.dawan.projects.business.projet;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projets")
public class ProjetController extends AbstractController<ProjetDto, ProjetService> {

    public ProjetController(ProjetService service) {
        super("projets", service);
    }
}

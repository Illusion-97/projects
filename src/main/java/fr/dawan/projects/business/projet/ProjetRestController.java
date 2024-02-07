package fr.dawan.projects.business.projet;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/projets")
public class ProjetRestController extends AbstractGenericRestController<ProjetDto, ProjetService> {
    public ProjetRestController(ProjetService service) {
        super(service);
    }
}

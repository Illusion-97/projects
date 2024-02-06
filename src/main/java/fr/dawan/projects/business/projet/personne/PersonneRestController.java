package fr.dawan.projects.business.projet.personne;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personnes")
public class PersonneRestController extends AbstractGenericRestController<PersonneDto,PersonneService> {
    public PersonneRestController(PersonneService service) {
        super(service);
    }
}

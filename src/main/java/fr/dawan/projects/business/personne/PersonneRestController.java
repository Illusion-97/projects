package fr.dawan.projects.business.personne;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/etudiants")
public class PersonneRestController extends AbstractGenericRestController<PersonneDto,PersonneService> {
    public PersonneRestController(PersonneService service) {
        super(service);
    }
}

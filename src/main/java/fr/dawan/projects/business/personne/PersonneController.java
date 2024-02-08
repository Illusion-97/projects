package fr.dawan.projects.business.personne;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("etudiants")
public class PersonneController extends AbstractController<PersonneDto, PersonneService> {

    public PersonneController(PersonneService service) {
        super("etudiants", service);
    }

    @Override
    protected PersonneDto getDTO() {
        return new PersonneDto();
    }
}

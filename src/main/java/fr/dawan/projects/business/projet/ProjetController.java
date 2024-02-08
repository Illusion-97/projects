package fr.dawan.projects.business.projet;

import fr.dawan.projects.business.competence.CompetenceService;
import fr.dawan.projects.business.personne.PersonneService;
import fr.dawan.projects.generic.AbstractController;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projets")
public class ProjetController extends AbstractController<ProjetDto, ProjetService> {

    private final CompetenceService competenceService;
    private final PersonneService personneService;

    public ProjetController(ProjetService service, CompetenceService competenceService, PersonneService personneService) {
        super("projets", service);
        this.competenceService = competenceService;
        this.personneService = personneService;
    }

    @Override
    @GetMapping("{id}")
    public String findById(@PathVariable long id, Model model) {
        model.addAttribute("comps", competenceService.findAll(Pageable.unpaged()));
        model.addAttribute("etudiants", personneService.findAll(Pageable.unpaged()));
        return super.findById(id, model);
    }

    @GetMapping("addContent/{id}")
    public String ajouterContenu(@PathVariable long id) {
        service.addContent(id);
        return "redirect:/projets/"+id;
    }

    public String supprimerContenu(long id) {

        return "redirect:/projets/"+id;
    }
}

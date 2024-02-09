package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.business.personne.PersonneService;
import fr.dawan.projects.business.projet.ProjetService;
import fr.dawan.projects.business.resume.Langue;
import fr.dawan.projects.generic.AbstractController;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Controller
@RequestMapping("dossiers")
public class DossierProjetController extends AbstractController<DossierProjetDto, DossierProjetService> {

    private final PersonneService personneService;
    private final ProjetService projetService;
    public DossierProjetController(DossierProjetService service, PersonneService personneService, ProjetService projetService) {
        super("dossiers", service);
        this.personneService = personneService;
        this.projetService = projetService;
    }

    @Override
    public String findById(long id, Model model) {
        model.addAttribute("projets", projetService.findAll(Pageable.unpaged()));
        model.addAttribute("etudiants", personneService.findAll(Pageable.unpaged()));
        model.addAttribute("langues", Arrays.stream(Langue.values()).map(Enum::name));
        return super.findById(id, model);
    }

    @PostMapping("addAnnexe/{dossierId}")
    public String addAnnexe(@PathVariable long dossierId, @RequestParam MultipartFile file) {
        service.addAnnexe(dossierId, file);
        return "redirect:/dossiers/"+dossierId;
    }

    @Override
    protected DossierProjetDto getDTO() {
        return new DossierProjetDto();
    }
}

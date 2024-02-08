package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dossiers")
public class DossierProjetController extends AbstractController<DossierProjetDto, DossierProjetService> {

    public DossierProjetController(DossierProjetService service) {
        super("dossiers", service);
    }

    @Override
    protected DossierProjetDto getDTO() {
        return new DossierProjetDto();
    }
}

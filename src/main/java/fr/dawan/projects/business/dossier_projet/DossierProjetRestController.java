package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dossier-projets")
public class DossierProjetRestController extends AbstractGenericRestController<DossierProjetDto, DossierProjetService> {
    public DossierProjetRestController(DossierProjetService service) {
        super(service);
    }
}

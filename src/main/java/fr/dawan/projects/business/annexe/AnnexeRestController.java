package fr.dawan.projects.business.annexe;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/annexes")
public class AnnexeRestController extends AbstractGenericRestController<AnnexeDto, AnnexeService> {
    public AnnexeRestController(AnnexeService service) {
        super(service);
    }
}

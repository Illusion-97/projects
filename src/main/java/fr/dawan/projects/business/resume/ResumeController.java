package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("resumes")
public class ResumeController extends AbstractController<ResumeDto, ResumeService> {

    public ResumeController(ResumeService service) {
        super("resumes", service);
    }

    @Override
    protected ResumeDto getDTO() {
        return new ResumeDto();
    }

    @GetMapping("byDossierAndLangue/{dossierId}/{langue}")
    public String getByDossierAndLangue(@PathVariable long dossierId, @PathVariable Langue langue, Model model) {
        model.addAttribute("element", service.findByDossier_IdAndLangue(dossierId,langue));
        return path + "/byId";
    }
}

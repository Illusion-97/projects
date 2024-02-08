package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("resumes")
public class ResumeController extends AbstractController<ResumeDto, ResumeService> {

    public ResumeController(ResumeService service) {
        super("resumes", service);
    }
}

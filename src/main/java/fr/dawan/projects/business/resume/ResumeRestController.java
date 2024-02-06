package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.AbstractGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resumes")
public class ResumeRestController extends AbstractGenericRestController<ResumeDto, ResumeService> {
    public ResumeRestController(ResumeService service) {
        super(service);
    }
}

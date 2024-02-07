package fr.dawan.projects.business.personne;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("etudiants")
@RequiredArgsConstructor
public class PersonneController {

    private final PersonneService service;
    @GetMapping
    public String all(Model model) {
        // Model permet la transmission d'informations entre le programme et le template
        model.addAttribute("elements", service.findAll(Pageable.unpaged()));
        return "etudiants/all";
    }
}

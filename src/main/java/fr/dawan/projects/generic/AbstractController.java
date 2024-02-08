package fr.dawan.projects.generic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
public abstract class AbstractController<D,S extends GenericService<D>> {
    private final String path;
    protected final S service;


    @GetMapping
    public String all(Model model) {
        // Model permet la transmission d'informations entre le programme et le template
        model.addAttribute("elements", service.findAll(Pageable.unpaged()));
        return path + "/all";
    }
}

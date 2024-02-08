package fr.dawan.projects.generic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/remove/{id}")
    public String delete(@PathVariable long id) {
        service.deleteById(id);
        return "redirect:/" + path;
    }

    @ModelAttribute("path")
    public String getPath() {
        return path;
    }
}

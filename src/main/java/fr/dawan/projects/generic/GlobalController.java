package fr.dawan.projects.generic;

import fr.dawan.projects.business.annexe.AnnexeService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;

@Controller
@ControllerAdvice  // Indique des traitements (@ModelAttribute, @ExceptionHandler, ...) devant être exécutés par tous les controllers de mon application
public class GlobalController {

    private final AnnexeService service;

    public GlobalController(AnnexeService service) {
        this.service = service;
    }

    @ExceptionHandler({SQLException.class})
    public String error(SQLException ex, Model model) {
        //model.addAttribute("message", ex.getMessage());
        model.addAttribute("message", "Une erreur SQL empêche la modification demandée.");
        return "error";
    }

    @GetMapping("/files/{filename}")
    public ResponseEntity<Resource> load(@PathVariable String filename) {
        Resource file = service.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+ file.getFilename() +"\"")
                .body(file);
    }
}

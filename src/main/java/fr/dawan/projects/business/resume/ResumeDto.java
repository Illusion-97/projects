package fr.dawan.projects.business.resume;

import fr.dawan.projects.business.dossier_projet.DossierProjetDto;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
    private long id;
    private int version;
    private Langue langue;
    private String texte;
    private long dossierId;
}

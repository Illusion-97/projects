package fr.dawan.projects.business.resume;

import fr.dawan.projects.business.dossier_projet.DossierProjet;
import fr.dawan.projects.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Resume extends BaseEntity {
    private Langue langue;
    private String texte;
    @ManyToOne
    private DossierProjet dossier;
}

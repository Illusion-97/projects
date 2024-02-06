package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.business.annexe.Annexe;
import fr.dawan.projects.business.personne.Personne;
import fr.dawan.projects.business.projet.Projet;
import fr.dawan.projects.business.resume.Resume;
import fr.dawan.projects.generic.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class DossierProjet extends BaseEntity {
    private String annee;
    @ManyToOne
    private Personne candidat;
    @ManyToOne
    private Projet projet;
    @OneToMany(mappedBy = "dossier", orphanRemoval = true)
    private List<Resume> resumes;
    @OneToMany
    private List<Annexe> annexes;
}

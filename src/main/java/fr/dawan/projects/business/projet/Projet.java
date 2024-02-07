package fr.dawan.projects.business.projet;

import fr.dawan.projects.business.competence.Competence;
import fr.dawan.projects.business.personne.Personne;
import fr.dawan.projects.generic.BaseEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Projet extends BaseEntity {
    private String nom;
    @ElementCollection
    private List<String> contenus;
    @ManyToMany
    private List<Competence> competences;
    @ManyToMany
    private List<Personne> participants;
}

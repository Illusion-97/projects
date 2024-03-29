package fr.dawan.projects.business.personne;

import fr.dawan.projects.generic.BaseEntity;
import jakarta.persistence.Entity;
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
@Table(name = "etudiant")
public class Personne extends BaseEntity {
    private String nom;
    private String prenom;
    private boolean active;
}

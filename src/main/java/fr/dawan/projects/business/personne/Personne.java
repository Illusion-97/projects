package fr.dawan.projects.business.personne;

import fr.dawan.projects.generic.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Personne extends BaseEntity {
    private String nom;
    private String prenom;
}

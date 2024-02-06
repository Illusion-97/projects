package fr.dawan.projects.business.personne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonneDto {
    private long id;
    private int version;
    private String nom;
    private String prenom;
}

package fr.dawan.projects.business.personne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class PersonneDto {
    private long id;
    private int version;
    private String nom;
    private String prenom;
}

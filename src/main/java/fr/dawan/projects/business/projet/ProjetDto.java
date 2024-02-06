package fr.dawan.projects.business.projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDto {
    private long id;
    private int version;
    private String nom;
    private String prenom;
}

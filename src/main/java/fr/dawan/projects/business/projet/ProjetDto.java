package fr.dawan.projects.business.projet;

import fr.dawan.projects.business.cometence.CompetenceDto;
import fr.dawan.projects.business.personne.PersonneDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDto {

    private long id;
    private int version;
    private String nom;
    private List<String> contenus;
    private List<CompetenceDto> competences;
    private List<PersonneDto> participants;
}

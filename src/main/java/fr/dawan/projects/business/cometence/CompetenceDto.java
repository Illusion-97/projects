package fr.dawan.projects.business.cometence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetenceDto {
    private long id;
    private int version;
    private String nom;
}

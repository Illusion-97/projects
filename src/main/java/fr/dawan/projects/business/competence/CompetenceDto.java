package fr.dawan.projects.business.competence;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class CompetenceDto {
    private long id;
    private int version;
    private String nom;
}

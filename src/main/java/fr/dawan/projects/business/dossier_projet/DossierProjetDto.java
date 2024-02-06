package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.business.annexe.AnnexeDto;
import fr.dawan.projects.business.personne.PersonneDto;
import fr.dawan.projects.business.projet.ProjetDto;
import fr.dawan.projects.business.resume.ResumeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DossierProjetDto {
    private long id;
    private int version;
    private String annee;
    private PersonneDto candidat;
    private ProjetDto projet;
    private List<ResumeDto> resumes;
    private List<AnnexeDto> annexes;
}

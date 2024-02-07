package fr.dawan.projects.business.dossier_projet;

import fr.dawan.projects.business.resume.ResumeMapper;
import fr.dawan.projects.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {ResumeMapper.class})
public interface DossierProjetMapper extends GenericMapper<DossierProjetDto, DossierProjet> {
}

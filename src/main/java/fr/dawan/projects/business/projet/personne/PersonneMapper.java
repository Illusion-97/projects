package fr.dawan.projects.business.projet.personne;

import fr.dawan.projects.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface PersonneMapper extends GenericMapper<PersonneDto,Personne> {
}

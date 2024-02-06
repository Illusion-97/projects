package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper
public interface ResumeMapper extends GenericMapper<ResumeDto, Resume> {
}

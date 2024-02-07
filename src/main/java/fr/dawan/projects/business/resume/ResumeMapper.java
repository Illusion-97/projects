package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.GenericMapper;
import org.mapstruct.*;

@Mapper
public interface ResumeMapper extends GenericMapper<ResumeDto, Resume> {
    @Override
    @Mapping(source = "dossier.id", target="dossierId")
    ResumeDto toDto(Resume entity);


    @Override
    @InheritInverseConfiguration
    Resume toEntity(ResumeDto dto);

    @Override
    @InheritInverseConfiguration
    Resume partialUpdate(ResumeDto dto, @MappingTarget Resume entity);
}

package fr.dawan.projects.business.resume;

import fr.dawan.projects.generic.GenericService;

public interface ResumeService extends GenericService<ResumeDto> {
    ResumeDto findByDossier_IdAndLangue(Long id, Langue langue);
}

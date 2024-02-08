package fr.dawan.projects.business.projet;

import fr.dawan.projects.generic.GenericService;

public interface ProjetService extends GenericService<ProjetDto> {
    void addContent(long id);
}

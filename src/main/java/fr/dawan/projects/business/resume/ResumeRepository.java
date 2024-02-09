package fr.dawan.projects.business.resume;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResumeRepository extends JpaRepository<Resume,Long> {

    Optional<Resume> findByDossier_IdAndLangue(Long id, Langue langue);
}

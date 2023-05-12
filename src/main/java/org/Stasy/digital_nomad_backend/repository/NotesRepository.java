package org.Stasy.digital_nomad_backend.repository;

import org.Stasy.digital_nomad_backend.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {
}

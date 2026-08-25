package com.fundoonotes.fundoonotesapp.repository;

import com.fundoonotes.fundoonotesapp.entity.Note;
import com.fundoonotes.fundoonotesapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    // Every lookup is scoped by owner - this is what makes Use Case 4's
    // ownership acceptance criteria hold: User B simply cannot fetch User A's note,
    // because it isn't part of the query result set at all (→ service returns 404).
    Optional<Note> findByNoteIdAndOwner(int noteId, User owner);

    List<Note> findByOwnerAndIsDeletedFalseAndIsArchivedFalse(User owner);
}

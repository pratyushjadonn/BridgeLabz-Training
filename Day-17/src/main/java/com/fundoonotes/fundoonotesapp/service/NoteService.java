package com.fundoonotes.fundoonotesapp.service;

import com.fundoonotes.fundoonotesapp.dto.NoteRequest;
import com.fundoonotes.fundoonotesapp.dto.NoteResponse;
import com.fundoonotes.fundoonotesapp.entity.Note;
import com.fundoonotes.fundoonotesapp.entity.User;
import com.fundoonotes.fundoonotesapp.exception.NoteNotFoundException;
import com.fundoonotes.fundoonotesapp.repository.NoteRepository;
import com.fundoonotes.fundoonotesapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;

    public NoteService(NoteRepository noteRepository, UserRepository userRepository) {
        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
    }

    private User getOwner(int userId) {
        // userId always comes from SecurityContextHolder (see NoteController),
        // never from a request body/param - that's the Use Case 3 rule, applied here.
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException("Authenticated user not found: " + userId));
    }

    public NoteResponse createNote(int userId, NoteRequest request) {
        User owner = getOwner(userId);

        Note note = new Note();
        note.setTitle(request.getTitle());
        note.setDescription(request.getDescription());
        note.setColor(request.getColor());
        note.setTypeOfNote(request.getTypeOfNote());
        note.setImageUrl(request.getImageUrl());
        note.setLinkUrl(request.getLinkUrl());
        note.setOwner(owner);

        Note saved = noteRepository.save(note);
        return NoteResponse.fromEntity(saved);
    }

    public List<NoteResponse> getNotesList(int userId) {
        User owner = getOwner(userId);
        return noteRepository.findByOwnerAndIsDeletedFalseAndIsArchivedFalse(owner)
                .stream()
                .map(NoteResponse::fromEntity)
                .toList();
    }

    public NoteResponse getNoteDetail(int userId, int noteId) {
        User owner = getOwner(userId);
        Note note = noteRepository.findByNoteIdAndOwner(noteId, owner)
                .orElseThrow(() -> new NoteNotFoundException(noteId));
        return NoteResponse.fromEntity(note);
    }

    public NoteResponse updateNote(int userId, NoteRequest request) {
        User owner = getOwner(userId);
        int noteId = request.getNoteId();

        Note note = noteRepository.findByNoteIdAndOwner(noteId, owner)
                .orElseThrow(() -> new NoteNotFoundException(noteId));

        note.setTitle(request.getTitle());
        note.setDescription(request.getDescription());
        note.setColor(request.getColor());
        note.setTypeOfNote(request.getTypeOfNote());
        note.setImageUrl(request.getImageUrl());
        note.setLinkUrl(request.getLinkUrl());

        Note saved = noteRepository.save(note);
        return NoteResponse.fromEntity(saved);
    }

    public void deleteNote(int userId, int noteId) {
        User owner = getOwner(userId);
        Note note = noteRepository.findByNoteIdAndOwner(noteId, owner)
                .orElseThrow(() -> new NoteNotFoundException(noteId));
        noteRepository.delete(note);
    }
}

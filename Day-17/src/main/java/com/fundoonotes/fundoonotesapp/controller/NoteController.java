package com.fundoonotes.fundoonotesapp.controller;

import com.fundoonotes.fundoonotesapp.dto.NoteRequest;
import com.fundoonotes.fundoonotesapp.dto.NoteResponse;
import com.fundoonotes.fundoonotesapp.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    // Identity ALWAYS comes from the SecurityContext (populated by JwtAuthFilter,
    // Use Case 3) - never from a path/query/body param. This is what makes the
    // ownership guarantee in Use Case 4's acceptance criteria actually hold.
    private int currentUserId(Authentication authentication) {
        return (int) authentication.getPrincipal();
    }

    @PostMapping("/addNotes")
    public ResponseEntity<NoteResponse> addNotes(@Valid @RequestBody NoteRequest request,
                                                  Authentication authentication) {
        NoteResponse response = noteService.createNote(currentUserId(authentication), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/getNotesList")
    public ResponseEntity<List<NoteResponse>> getNotesList(Authentication authentication) {
        return ResponseEntity.ok(noteService.getNotesList(currentUserId(authentication)));
    }

    @GetMapping("/getNotesDetail/{noteId}")
    public ResponseEntity<NoteResponse> getNotesDetail(@PathVariable int noteId,
                                                         Authentication authentication) {
        return ResponseEntity.ok(noteService.getNoteDetail(currentUserId(authentication), noteId));
    }

    @PostMapping("/updateNotes")
    public ResponseEntity<NoteResponse> updateNotes(@Valid @RequestBody NoteRequest request,
                                                      Authentication authentication) {
        return ResponseEntity.ok(noteService.updateNote(currentUserId(authentication), request));
    }

    // Not part of the source doc's UC4 endpoint list (real deletion semantics -
    // trashNotes vs deleteForeverNotes - arrive in Use Case 5). Kept minimal here
    // only so the CRUD loop is testable end-to-end during Day 3.
    @DeleteMapping("/{noteId}")
    public ResponseEntity<Void> deleteNote(@PathVariable int noteId, Authentication authentication) {
        noteService.deleteNote(currentUserId(authentication), noteId);
        return ResponseEntity.noContent().build();
    }
}

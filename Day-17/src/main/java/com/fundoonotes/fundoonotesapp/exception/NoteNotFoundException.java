package com.fundoonotes.fundoonotesapp.exception;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(int noteId) {
        // Deliberately generic message - Use Case 4's acceptance criteria requires
        // this to look identical whether the note doesn't exist OR belongs to
        // someone else (404, not 403), so it never leaks which case it is.
        super("Note not found: " + noteId);
    }
}

package com.fundoonotes.fundoonotesapp.dto;

import com.fundoonotes.fundoonotesapp.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Keeping the raw Entity out of Controller responses starts here, even though
// the *strict* audit for this across the whole app happens in Use Case 14.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteResponse {

    private int noteId;
    private String title;
    private String description;
    private boolean isPined;
    private boolean isArchived;
    private boolean isDeleted;
    private String color;
    private String typeOfNote;
    private String imageUrl;
    private String linkUrl;

    public static NoteResponse fromEntity(Note note) {
        return new NoteResponse(
                note.getNoteId(),
                note.getTitle(),
                note.getDescription(),
                note.isPined(),
                note.isArchived(),
                note.isDeleted(),
                note.getColor(),
                note.getTypeOfNote(),
                note.getImageUrl(),
                note.getLinkUrl()
        );
    }
}

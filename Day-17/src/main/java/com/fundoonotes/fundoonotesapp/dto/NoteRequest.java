package com.fundoonotes.fundoonotesapp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NoteRequest {

    // Only used by /notes/updateNotes (ignored on create).
    private Integer noteId;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;
    private String color;
    private String typeOfNote;
    private String imageUrl;
    private String linkUrl;
}

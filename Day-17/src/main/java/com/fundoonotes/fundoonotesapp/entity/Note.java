package com.fundoonotes.fundoonotesapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noteId;

    private String title;

    private String description;

    // Field names match the source doc exactly (isPined, not "pinned")
    // so this stays interoperable with the real Fundoo frontend/tests.
    private boolean isPined = false;
    private boolean isArchived = false;
    private boolean isDeleted = false;

    private String color;

    private String typeOfNote; // e.g. TEXT, CHECKLIST, IMAGE, LINK

    private String imageUrl;
    private String linkUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
}

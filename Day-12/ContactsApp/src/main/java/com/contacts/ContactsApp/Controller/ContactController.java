package com.contacts.ContactsApp.Controller;

import com.contacts.ContactsApp.Service.ContactService;
import com.contacts.ContactsApp.dto.ContactRequestDTO;
import com.contacts.ContactsApp.dto.ContactResponseDTO;
import com.contacts.ContactsApp.Service.ContactServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<ContactResponseDTO> createContact(
            @Valid @RequestBody ContactRequestDTO requestDTO) {
        ContactResponseDTO created = contactService.createContact(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> getContact(@PathVariable Long id) {
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> getAllContacts() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> updateContact(
            @PathVariable Long id,
            @Valid @RequestBody ContactRequestDTO requestDTO) {
        return ResponseEntity.ok(contactService.updateContact(id, requestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}

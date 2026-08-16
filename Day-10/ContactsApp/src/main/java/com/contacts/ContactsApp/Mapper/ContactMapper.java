package com.contacts.ContactsApp.Mapper;


import com.contacts.ContactsApp.Entity.Contacts;
import com.contacts.ContactsApp.dto.ContactRequestDTO;
import com.contacts.ContactsApp.dto.ContactResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    // Incoming request -> new Entity (no id, no timestamps — DB/Hibernate sets those)
    public Contacts toEntity(ContactRequestDTO dto) {
        return Contacts.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .build();
    }

    // Entity -> outgoing response
    public ContactResponseDTO toResponseDTO(Contacts contact) {
        return ContactResponseDTO.builder()
                .id(contact.getId())
                .name(contact.getName())
                .email(contact.getEmail())
                .phone(contact.getPhone())
                .address(contact.getAddress())
                .createdAt(contact.getCreatedAt())
                .updatedAt(contact.getUpdatedAt())
                .build();
    }

}

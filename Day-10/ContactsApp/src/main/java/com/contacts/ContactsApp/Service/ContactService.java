package com.contacts.ContactsApp.Service;

import com.contacts.ContactsApp.dto.ContactRequestDTO;
import com.contacts.ContactsApp.dto.ContactResponseDTO;

import java.util.List;

public interface ContactService {
    ContactResponseDTO createContact(ContactRequestDTO requestDTO);
    ContactResponseDTO getContactById(Long id);
    List<ContactResponseDTO> getAllContacts();
    ContactResponseDTO updateContact(Long id, ContactRequestDTO requestDTO);
    void deleteContact(Long id);
}

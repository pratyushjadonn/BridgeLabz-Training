package com.contacts.ContactsApp.Service;


import com.contacts.ContactsApp.Entity.Contacts;
import com.contacts.ContactsApp.dto.ContactRequestDTO;
import com.contacts.ContactsApp.dto.ContactResponseDTO;
import com.contacts.ContactsApp.Entity.Contacts;
import com.contacts.ContactsApp.Exception.ContactNotFoundException;
import com.contacts.ContactsApp.Exception.DuplicateEmailException;
import com.contacts.ContactsApp.Mapper.ContactMapper;
import com.contacts.ContactsApp.Repository.ContactRepository;
import com.contacts.ContactsApp.Service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor   // Lombok generates constructor for final fields -> constructor injection
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    @Override
    @Transactional
    public ContactResponseDTO createContact(ContactRequestDTO requestDTO) {
        if (contactRepository.existsByEmail(requestDTO.getEmail())) {
            throw new DuplicateEmailException("Contact with email " + requestDTO.getEmail() + " already exists");
        }
        Contacts contact = contactMapper.toEntity(requestDTO);
        Contacts saved = contactRepository.save(contact);
        return contactMapper.toResponseDTO(saved);
    }

    @Override
    public ContactResponseDTO getContactById(Long id) {
        Contacts contact = contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));
        return contactMapper.toResponseDTO(contact);
    }

    @Override
    public List<ContactResponseDTO> getAllContacts() {
        return contactRepository.findAll()
                .stream()
                .map(contactMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ContactResponseDTO updateContact(Long id, ContactRequestDTO requestDTO) {
        Contacts existing = contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        existing.setName(requestDTO.getName());
        existing.setEmail(requestDTO.getEmail());
        existing.setPhone(requestDTO.getPhone());
        existing.setAddress(requestDTO.getAddress());

        Contacts updated = contactRepository.save(existing);
        return contactMapper.toResponseDTO(updated);
    }

    @Override
    @Transactional
    public void deleteContact(Long id) {
        if (!contactRepository.existsById(id)) {
            throw new ContactNotFoundException("Contact not found with id: " + id);
        }
        contactRepository.deleteById(id);
    }
}

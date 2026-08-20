package com.contacts.ContactsApp.Repository;

import com.contacts.ContactsApp.Entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contacts,Long> {
    Optional<Contacts> findByEmail(String email);
    boolean existsByEmail(String email);
}

package scenario.based;
import java.util.ArrayList;
import java.util.List;

// Custom Exception for phone number
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Contact class
class Contact {
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        // Check phone number length
        if (phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// Contact Manager class
class ContactManager {
    List<Contact> contactList = new ArrayList<>();

    // Add contact
    public void addContact(Contact contact) {
        // Check duplicate phone number
        for (Contact c : contactList) {
            if (c.getPhoneNumber().equals(contact.getPhoneNumber())) {
                System.out.println("Contact already exists!");
                return;
            }
        }
        contactList.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Search contact
    public void searchContact(String phoneNumber) {
        for (Contact c : contactList) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Name: " + c.getName());
                System.out.println("Phone: " + c.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact
    public void deleteContact(String phoneNumber) {
        for (Contact c : contactList) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactList.remove(c);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

// Main class
public class ContactOrganizer {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        try {
            Contact c1 = new Contact("Pratyush", "9876543210");
            Contact c2 = new Contact("Aman", "1234567890");

            manager.addContact(c1);
            manager.addContact(c2);

            // Duplicate contact
            manager.addContact(new Contact("Duplicate", "9876543210"));

            // Search
            manager.searchContact("9876543210");

            // Delete
            manager.deleteContact("1234567890");

            // Invalid phone number
            manager.addContact(new Contact("Invalid", "1234"));

        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

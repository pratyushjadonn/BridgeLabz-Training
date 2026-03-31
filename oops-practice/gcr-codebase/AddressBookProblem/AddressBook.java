package addressBook;

import java.util.ArrayList;
public class AddressBook {     //UC2
	ArrayList<Contacts> contacts=new ArrayList<Contacts>();
	public void addContact(Contacts contact) {
		contacts.add(contact);
		System.out.println("Added contact successfully");
	}
	//UC 3
	public void editContacts(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber, String email) {
		for(Contacts i: contacts) {
			if(i.getFirstName().equalsIgnoreCase(firstName) && i.getLastName().equalsIgnoreCase(lastName)) {
				i.setAddress(address);
				i.setCity(city);
				i.setEmail(email);
				i.setNumber(phoneNumber);
				i.setState(state);
				i.setZip(zip);	
				System.out.println("Updated successfully");
				return;
			}
		}
		System.out.println("Contact not found");
		
	}
	//UC 4
	public void deleteContact(String firstName,String lastName) {
		for(int i=0;i<contacts.size();i++) {
			if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName)) {
				contacts.remove(i);
				return;
			}
		}
		System.out.println("contact is not available");
		
	}
	
	public void showContacts() {
		if(contacts.isEmpty()) {
			System.out.println("No contacts available");
			return;
		}
		for(Contacts e:contacts) {
			e.display();
		}
	}

}
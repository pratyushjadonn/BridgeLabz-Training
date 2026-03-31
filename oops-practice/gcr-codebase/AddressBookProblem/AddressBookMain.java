package addressBook;
import java.util.Scanner;
public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AddressBook book=new AddressBook();
		while(true) {
			
		    System.out.println("Welcome to Address Book Program");
		    System.out.println("1. Create a Contact");
		    System.out.println("2. Edit a contact ");
		    System.out.println("3. Show all contact");
		    System.out.println("4. Delete a contact");
		    System.out.println("5. Exit");
		    int choice = sc.nextInt();
		    
		    switch(choice) {
		    
		        case 1:
				    System.out.println("Enter the First Name:");
				    String firstName=sc.next();
				    
				    System.out.print("Enter the Last Name:");
				    String lastName=sc.next();
				    
					System.out.print("Enter the address:");
					String address=sc.next();
					
					System.out.print("Enter the City:");
					String city=sc.next();
					
					System.out.print("Enter the State:");
					String state=sc.next();
					
					System.out.print("Enter the zip");
					int zip=sc.nextInt();
					
					System.out.print("enterthe phone number");
					String phoneNumber=sc.next();
					
					System.out.print("Enter the Email:");
					String email=sc.next();
					
					book.addContact(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));
					break;
				
		        case 2:
		        	System.out.println("Enter the Contact First Name to edit:");
				    String editFirstName=sc.next();
				    
				    System.out.print("Enter the Contact Last Name to edit:");
				    String editLastName=sc.next();
				    
					System.out.print("Enter the new address:");
					String newAddress=sc.next();
					
					System.out.print("Enter the new City:");
					String newCity=sc.next();
					
					System.out.print("Enter the new State:");
					String newState=sc.next();
					
					System.out.print("Enter the new zip");
					int newZip=sc.nextInt();
					
					System.out.print("Enter the new phone number");
					String newPhoneNumber=sc.next();
					
					System.out.print("Enter the new Email:");
					String newEmail=sc.next();
		        	
					book.editContacts(editFirstName, editLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
					break;
		            
		        case 3:
		        	book.showContacts();
		        	break;
		        
		        case 4:
		        	System.out.println("Enter the first Name of Contact:");
		        	String fn=sc.next();
		        	System.out.println("Enter the last Name of Contact");
		        	String ln=sc.next();
		        	book.deleteContact(fn, ln);
		        	break;
		        	
		        	
		        case 5:
		        	System.out.println("Exit Successfully");
		        	return;
		        	
		        	
		        default:
                    System.out.println("Invalid choice!");
		        		
		        	
		
		    }
		}
	
		
	}

}

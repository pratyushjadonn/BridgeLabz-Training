package addressBook;
//UC 1
public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;
	
	public Contacts( String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber, String email) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.email=email;	
	}
	String getFirstName() {
		return firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setAddress(String Address) {
		this.address=Address;
	}
	void setCity(String City) {
		this.city=City;
	}
	void setState(String State) {
		this.state=State;
	}
	void setZip(int Zip) {
		this.zip=Zip;
	}
	void setNumber(String Number) {
		this.phoneNumber=Number;
		
	}
	void setEmail(String Email) {
		this.email=Email;
	}
	
	public void display() {
		System.out.println("Name:"+firstName+" "+lastName+
				"Address: " +address+
				"city:" +city+
				"state: "+state+
				"zip: "+zip+
				"Phone Number: "+phoneNumber+
				"email: "+email);	
	}
}

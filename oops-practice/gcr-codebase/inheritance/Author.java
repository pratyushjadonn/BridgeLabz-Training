package Inheritance;
public class Author extends Book {
  String name="William";
  String bio="about vecna";
  
  public void displayInfo(){
	  System.out.println("Title: "+title);
	  System.out.println("PublicationYear: "+publicationYear);
	  System.out.println("Name: "+name);
	  System.out.println("Bio: "+bio);
	  
  }
}

package level1;

import java.util.Scanner;
class Book{
	String title;
	String author;
	double price;
	Book(){
		title="Twisted";
		author="Shags";
		price=640.0;
	}
	Book(String title, String author , double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
}


public class CreateBookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//default constructor
	    Book issue1=new Book();
	    System.out.println(issue1);
	    //parameter constructor
	    Book issue2=new Book("The lost life"," Peter Hederson",650);
	    System.out.println(issue2);	    
	    
	}

}

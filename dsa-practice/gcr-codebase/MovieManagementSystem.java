package linkedlist;

//node class
class Node {
	Movie data;
	Node next;
	Node prev;

	Node(Movie data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

//movie class
class Movie {
	String movieTitle;
	String director;
	int yearOfRelease;
	double rating;
	//constructor to initialize objects
	Movie(String movieTitle, String director, int yearOfRelease, double rating) {
		this.movieTitle = movieTitle;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
	}
}

//main class
public class MovieManagementSystem {
	static Node head;
	
	//method to insert node at beginning of a linked list
	static void insertNodeAtBegin(Movie movie) {
		Node newNode = new Node(movie);
		if (head == null) {
			head = newNode;
			System.out.println("Node added");
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		System.out.println("Node added");
	}
	
	//method to insert node at the end of a linked list
	static void insertNodeAtEnd(Movie movie) {
		Node newNode = new Node(movie);
		if (head == null) {
			head = newNode;
			System.out.println("Node added");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		System.out.println("Node added");
	}

	//method to insert node at a given position
	static void insertNodeAtPosition(Movie movie, int position) {
		Node newNode = new Node(movie);
		if (position == 1) {
			insertNodeAtBegin(movie);
			return;
		}
		int i = 1;
		Node temp = head;
		while (i < position - 1 && temp != null) {
			i++;
			temp = temp.next;
		}
		if (temp != null) {
			newNode.prev = temp;
			newNode.next = temp.next;
			if (temp.next != null) {
				temp.next.prev = newNode;
			}
			temp.next = newNode;
			System.out.println("Node added");

		} else {
			System.out.println("Not a valid position");
		}
		System.out.println("--------------------------------------");
	}
	
	//method to remove nodes
	static void removeNode(String title) {
		if (head != null && head.data.movieTitle.equals(title)) {
			head = head.next;
			if (head != null)
				head.prev = null;
			System.out.println("Node was deleted");
			return;
		}
		Node temp = head.next;
		Node temp1 = head;
		while (temp != null) {
			if (temp.data.movieTitle.equals(title)) {
				temp1.next = temp1.next.next;
				if (temp.next != null) {
					temp.next.prev = temp1;
				}
				System.out.println("Node was deleted");
				return;
			}
			temp1 = temp;
			temp = temp.next;
		}
		System.out.println("Node with this movie title does not exist so could not be deleted");
	}
	
	//method to search a node
	static void searchNode(String director, double rating) {
		System.out.println("------------------------------------------------------------");
		Node temp = head;
		while (temp != null) {
			if (temp.data.director.equals(director) || temp.data.rating == rating) {
				System.out.println("Node found with the director or rating");
				System.out.println("Movie title : " + temp.data.movieTitle);
				System.out.println("Director : " + temp.data.director);
				System.out.println("Year of release : " + temp.data.yearOfRelease);
				System.out.println("Rating : " + temp.data.rating);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie Node with this director or rating does not exist");
	}

	//method to display nodes of a linked list
	static void display() {
		Node temp = head;
		Node temp1 = null;
		System.out.println("-----------------------------------------");
		System.out.println("Displaying movie in forward direction");
		while (temp != null) {
			System.out.println("Movie title : " + temp.data.movieTitle);
			System.out.println("Director : " + temp.data.director);
			System.out.println("Year of release : " + temp.data.yearOfRelease);
			System.out.println("Rating : " + temp.data.rating);
			System.out.println("-------------------------------");
			temp1 = temp;
			temp = temp.next;
		}
		System.out.println("Displaying movies in backward direction");
		while (temp1 != null) {
			System.out.println("Movie title : " + temp1.data.movieTitle);
			System.out.println("Director : " + temp1.data.director);
			System.out.println("Year of release : " + temp1.data.yearOfRelease);
			System.out.println("Rating : " + temp1.data.rating);
			System.out.println("-------------------------------");
			temp1 = temp1.prev;
		}
	}

	//method to update a node
	static void updateNode(String title, double rating) {
		System.out.println("--------------------------------");
		Node temp = head;
		while (temp != null) {
			if (temp.data.movieTitle.equals(title)) {
				temp.data.rating = rating;
				System.out.println("Rating updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie Node with this title does not exist");
	}

	//main method
	public static void main(String[] args) {
		//objects of movie class
		Movie m1 = new Movie("Titanic", "James Cameron", 1997, 7.9);
		Movie m2 = new Movie("Inception", "Christopher Nolan", 2010, 8.8);
		Movie m3 = new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0);
		Movie m4 = new Movie("Avatar", "James Cameron", 2009, 7.8);
		//method call to insert node at beginning
		insertNodeAtBegin(m1);
		//method call to display nodes in both forward and backward directions
		display();
		//method call to insert node at the end
		insertNodeAtEnd(m2);
		display();
		//method call to insert node at a given position
		insertNodeAtPosition(m3, 2);
		display();
		insertNodeAtPosition(m4, 1);
		display();
		//remove node
		removeNode("Titanic");
		display();
		removeNode("xyz");
		display();
		//search a node
		searchNode("Christopher Nolan", 4.6);
		searchNode("James Cameron", 2.3);
		//update node
		updateNode("Inception", 10);
		display();
	}
}

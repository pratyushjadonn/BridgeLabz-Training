package linkedlist;
//node class
class Node {
	Student data;
	Node next;

	Node(Student data) {
		this.data = data;
		this.next = null;
	}
}
//student class
class Student {
	int rollNumber;
	String name;
	int age;
	char grade;
	//constructor to initialize student object
	Student(int rollNumber, String name, int age, char grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
//main class
public class StudentRecordManagement {
	static Node head;

	//method to insert nodes at the end of a linked list
	static void insertNodeAtEnd(Student student) {
		Node newNode = new Node(student);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//method to insert nodes at the beginning of the linked list
	static void insertNodeAtBegin(Student student) {
		Node newNode = new Node(student);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//method to insert nodes in a linked list at a particular position
	static void insertNodeAtPosition(Student student, int position) {
		if (position == 1) {
			insertNodeAtBegin(student);
			return;
		}
		int i = 1;
		Node temp = head;
		while (i < position - 1 && temp != null) {
			temp = temp.next;
			i++;
		}
		if (temp != null) {
			Node nn = temp.next;
			temp.next = new Node(student);
			temp.next.next = nn;
		} else {
			System.out.println("Invalid position");
			return;

		}
	}
	
	//method to delete a student node by his roll number
	static void deleteNode(int rollNumber) {
		if (head != null && head.data.rollNumber == rollNumber) {
			head = head.next;
			return;
		}
		Node temp1 = head;
		Node temp2 = head;
		while (temp1 != null && temp1.data.rollNumber != rollNumber) {
			temp2 = temp1;
			temp1 = temp1.next;
		}
		if (temp1 != null) {
			temp2.next = temp1.next;
		} else {
			System.out.println("Student not found");
		}
	}

	//method to search a student node by his roll number
	static void searchNode(int rollNumber) {
		Node temp = head;
		while (temp != null && temp.data.rollNumber != rollNumber) {
			temp = temp.next;
		}
		if (temp != null) {
			System.out.println("Node founded ");
			System.out.println("Student roll no. : " + temp.data.rollNumber);
			System.out.println("Student name : " + temp.data.name);
			System.out.println("Student age : " + temp.data.age);
			System.out.println("Student grade : " + temp.data.grade);
			System.out.println("--------------------------------------");
		} else {
			System.out.println("Node not founded");
		}
	}

	//method to display nodes in a linked list
	static void display() {
		Node temp = head;
		System.out.println("-----------------Displaying Nodes------------------");
		while (temp != null) {
			System.out.println("Student roll no. : " + temp.data.rollNumber);
			System.out.println("Student name : " + temp.data.name);
			System.out.println("Student age : " + temp.data.age);
			System.out.println("Student grade : " + temp.data.grade);
			System.out.println("--------------------------------------");
			temp = temp.next;
		}
	}
	
	//method to update grades of a student by his roll number
	static void updateGrades(int rollNumber, char grade) {
		Node temp = head;
		while (temp != null && temp.data.rollNumber != rollNumber) {
			temp = temp.next;
		}
		if (temp != null) {
			temp.data.grade = grade;
			System.out.println("Grades updated");
		} else {
			System.out.println("No student was found with this roll number so grades could not be updataed");
		}

	}
	
	//main method
	public static void main(String[] args) {
		Student s1 = new Student(1, "Bhumika", 21, 'A');
		Student s2 = new Student(2, "Prachi", 19, 'A');
		Student s3 = new Student(3, "Shivam", 16, 'A');
		Student s4 = new Student(4, "Divyansh", 5, 'A');
		Student s5 = new Student(5, "Khushi", 6, 'B');
		// insert node at beginning of a linked list
		insertNodeAtBegin(s1);
		display();
		//insert node at the end of a linked list
		insertNodeAtEnd(s2);
		display();
		//insert node at the beginning of a linked list
		insertNodeAtBegin(s3);
		display();
		//insert node at a particular position
		insertNodeAtPosition(s4, 4);
		display();
		//insert node at a invalid position
		insertNodeAtPosition(s4,9);
		insertNodeAtPosition(s5, 5);
		// display all nodes of a linked list
		display();
		// delete a student by rollNumber
		deleteNode(2);
		display();
		deleteNode(8);
		display();
		// searching nodes
		searchNode(1);
		searchNode(6);
		// update grades based on roll_Numbers
		updateGrades(5, 'C');
		display();
	}
}

package reviews;

import java.util.Scanner;
class LinkedListNode{
	int data;
	LinkedListNode next;
	public LinkedListNode(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.next=null;
	}	
}

  class DataLinkedList {
	LinkedListNode head;
	void addAtBeginning(int data) {
		LinkedListNode newNode=new LinkedListNode(data);
		if(head==null) {
			head= newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	void deleteFromBeginning() {
		head=head.next;
		return ;	
	}
	void addAtEnd(int data) {
		LinkedListNode newNode=new LinkedListNode(data);
		if(head==null) {
			head=newNode;
			return;
		}
		LinkedListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;		
	}
	void deletefromEnd() {
		LinkedListNode temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
			
		}
		temp.next=null;
		return;
	}
	void addAtPosition(int position,int data) {
		LinkedListNode newNode=new LinkedListNode(data);
		if(position==1) {
			addAtBeginning(data);
			return;
		}
		int intial=1;
		LinkedListNode temp=head;
		for(int i=1;i<position-1 && temp!=null ;i++) {
			temp=temp.next;		
		}
		if(temp==null) {
			System.out.println("Position is invalid ");
			return;
		}		
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	void deleteByPosition(int position) {
		int intial=1;
		if(position==1) {
			deleteFromBeginning();
		}
		LinkedListNode temp=head;
		while(intial!=position-1) {
			temp=temp.next;
			intial++;		
		}
		temp.next=temp.next.next;
		return;
	}
	void displayAll() {
		if(head==null) {
			System.out.println("No record found");
			return;
		}
		LinkedListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	

}
  public class LinkedListImp{
	  public static void main(String[] args) {
		  DataLinkedList ls =new DataLinkedList();
		  ls.addAtBeginning(5);
		  ls.addAtEnd(6);
		  ls.addAtPosition(2, 7);
		  ls.deleteByPosition(2);
		  ls.deletefromEnd();
		  ls.deleteFromBeginning();
		  ls.displayAll();		 	
	}
	  
  }

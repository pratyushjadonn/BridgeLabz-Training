package dsa_leetcode;

// Definition for singly-linked list
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

// LinkedListOperations class containing reverse method
public class ReverseLinkedList {

	// Recursive method to reverse linked list
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nn = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return nn;
	}

	// Helper method to print linked list
	public void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Main method to test reversal
	public static void main(String[] args) {
		// Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ReverseLinkedList operations = new ReverseLinkedList();

		System.out.println("Original Linked List:");
		operations.printList(head);

		// Reverse the linked list
		ListNode reversedHead = operations.reverseList(head);

		System.out.println("Reversed Linked List:");
		operations.printList(reversedHead);
	}
}

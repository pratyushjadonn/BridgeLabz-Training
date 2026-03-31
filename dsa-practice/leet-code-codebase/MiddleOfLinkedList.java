package dsa_leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class MiddleOfLinkedList {

	// Method to find middle node
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next; // moves 1 step
			fast = fast.next.next; // moves 2 steps
		}
		return slow;
	}

	// Method to print linked list
	public static void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		// Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.print("Linked List: ");
		printList(head);

		ListNode middle = middleNode(head);
		System.out.println("Middle Node: " + middle.val);
	}
}

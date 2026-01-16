package dsa_leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class RemoveDuplicatesSortedList {

	// Method to remove duplicates
	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next; // skip duplicate
			} else {
				current = current.next;
			}
		}
		return head;
	}

	// Method to print linked list
	public static void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// MAIN METHOD
	public static void main(String[] args) {

		// Creating sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);

		System.out.println("Original List:");
		printList(head);

		head = deleteDuplicates(head);

		System.out.println("After Removing Duplicates:");
		printList(head);
	}
}

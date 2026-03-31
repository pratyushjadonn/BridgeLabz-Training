package dsa_leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class DeleteNodeInLinkedList {

	// Method to delete node (LeetCode logic)
	static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	// Print list
	static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}

	// MAIN METHOD
	public static void main(String[] args) {

		// Create list: 4 -> 5 -> 1 -> 9
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);

		System.out.println("Original List:");
		printList(head);

		// Delete node with value 5
		deleteNode(head.next);

		System.out.println("After Deleting Node:");
		printList(head);
	}
}

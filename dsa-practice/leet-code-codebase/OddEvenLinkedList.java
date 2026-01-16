package dsa_leetcode;

class OddEvenLinkedList {

	// Definition for singly-linked list
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	// Function to rearrange odd and even nodes
	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;

		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;

			even.next = odd.next;
			even = even.next;
		}

		// Attach even list after odd list
		odd.next = evenHead;

		return head;
	}

	// Print linked list
	static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}

	// Main function
	public static void main(String[] args) {

		// Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.print("Original List: ");
		printList(head);

		head = oddEvenList(head);

		System.out.print("Odd Even List: ");
		printList(head);
	}
}

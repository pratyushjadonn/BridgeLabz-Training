package dsa_leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class LinkedListCycle {

	// Method to detect cycle
	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 step
			fast = fast.next.next; // 2 steps

			if (slow == fast) {
				return true; // cycle detected
			}
		}
		return false; // no cycle
	}

	public static void main(String[] args) {

		// Creating nodes
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		// Linking nodes: 1 -> 2 -> 3 -> 4
		head.next = second;
		second.next = third;
		third.next = fourth;

		// Creating a cycle: 4 -> 2
		fourth.next = second;

		System.out.println("Does the linked list have a cycle?");
		System.out.println(hasCycle(head)); // true
	}
}

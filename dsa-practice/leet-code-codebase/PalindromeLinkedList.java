package dsa_leetcode;

class PalindromeLinkedList {

	// Definition for singly-linked list
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	// Function to check palindrome
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;

		// Step 1: Find middle
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// Step 2: Reverse second half
		ListNode secondHalf = reverse(slow);
		ListNode firstHalf = head;

		// Step 3: Compare both halves
		while (secondHalf != null) {
			if (firstHalf.val != secondHalf.val)
				return false;

			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}

		return true;
	}

	// Reverse linked list
	private static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	// Main function
	public static void main(String[] args) {

		// Creating linked list: 1 -> 2 -> 2 -> 1
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);

		boolean result = isPalindrome(head);

		System.out.println("Is Palindrome: " + result);
	}
}

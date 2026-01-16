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

// Class to perform linked list operations
public class MergeTwoSortedLinkedList {

	// Method to merge two sorted linked lists
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode(0); // dummy node
		ListNode temp = head;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}

		// Attach remaining nodes
		if (list1 != null)
			temp.next = list1;
		if (list2 != null)
			temp.next = list2;

		return head.next; // return merged list starting from first real node
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

	// Main method to test merging
	public static void main(String[] args) {
		// Create first sorted linked list: 1 -> 3 -> 5
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);

		// Create second sorted linked list: 2 -> 4 -> 6
		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);

		MergeTwoSortedLinkedList operations = new MergeTwoSortedLinkedList();

		System.out.println("List 1:");
		operations.printList(list1);

		System.out.println("List 2:");
		operations.printList(list2);

		// Merge lists
		ListNode mergedHead = operations.mergeTwoLists(list1, list2);

		System.out.println("Merged List:");
		operations.printList(mergedHead);
	}
}

package linkedlist;

// Node class for inventory items
class Node {
	Item data;
	Node next;

	Node(Item data) {
		this.data = data;
		this.next = null;
	}
}

// Item class
class Item {
	int itemId;
	String itemName;
	int quantity;
	double price;

	Item(int itemId, String itemName, int quantity, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
}

// Inventory Management System
public class InventoryManagementSystem {
	static Node head;

	// Add item at the end
	static void addItemAtEnd(Item item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = newNode;
	}

	// Add item at the beginning
	static void addItemAtBegin(Item item) {
		Node newNode = new Node(item);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// Add item at a specific position (1-based)
	static void addItemAtPosition(Item item, int position) {
		if (position <= 0) {
			System.out.println("Invalid position");
			return;
		}
		if (position == 1) {
			addItemAtBegin(item);
			return;
		}
		Node temp = head;
		int count = 1;
		while (count < position - 1 && temp != null) {
			temp = temp.next;
			count++;
		}
		if (temp != null) {
			Node nn = temp.next;
			temp.next = new Node(item);
			temp.next.next = nn;
		} else {
			System.out.println("Invalid position");
		}
	}

	// Remove item by Item ID
	static void removeItem(int itemId) {
		if (head != null && head.data.itemId == itemId) {
			head = head.next;
			System.out.println("Item removed: " + itemId);
			return;
		}
		Node temp1 = head, temp2 = head;
		while (temp1 != null && temp1.data.itemId != itemId) {
			temp2 = temp1;
			temp1 = temp1.next;
		}
		if (temp1 != null) {
			temp2.next = temp1.next;
			System.out.println("Item removed: " + itemId);
		} else {
			System.out.println("Item not found: " + itemId);
		}
	}

	// Update quantity by Item ID
	static void updateQuantity(int itemId, int newQuantity) {
		Node temp = head;
		while (temp != null && temp.data.itemId != itemId)
			temp = temp.next;
		if (temp != null) {
			temp.data.quantity = newQuantity;
			System.out.println("Quantity updated for Item ID: " + itemId);
		} else {
			System.out.println("Item not found: " + itemId);
		}
	}

	// Search by Item ID or Name
	static void searchItem(int itemId, String itemName) {
		Node temp = head;
		boolean found = false;
		while (temp != null) {
			if ((itemId != -1 && temp.data.itemId == itemId)
					|| (itemName != null && temp.data.itemName.equalsIgnoreCase(itemName))) {
				System.out.println("Item found: ID=" + temp.data.itemId + ", Name=" + temp.data.itemName + ", Quantity="
						+ temp.data.quantity + ", Price=" + temp.data.price);
				found = true;
			}
			temp = temp.next;
		}
		if (!found)
			System.out.println("Item not found");
	}

	// Display all items
	static void displayInventory() {
		Node temp = head;
		System.out.println("----- Inventory -----");
		while (temp != null) {
			System.out.println("ID: " + temp.data.itemId + ", Name: " + temp.data.itemName + ", Quantity: "
					+ temp.data.quantity + ", Price: " + temp.data.price);
			temp = temp.next;
		}
		System.out.println("--------------------");
	}

	// Calculate total inventory value
	static void calculateTotalValue() {
		Node temp = head;
		double total = 0;
		while (temp != null) {
			total += temp.data.quantity * temp.data.price;
			temp = temp.next;
		}
		System.out.println("Total inventory value: " + total);
	}

	// Sort by Item Name (Ascending)
	static void sortByName() {
		if (head == null || head.next == null)
			return;

		head = mergeSortByName(head);
	}

	// Merge sort implementation for name
	private static Node mergeSortByName(Node h) {
		if (h == null || h.next == null)
			return h;

		Node middle = getMiddle(h);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = mergeSortByName(h);
		Node right = mergeSortByName(nextOfMiddle);

		return sortedMergeByName(left, right);
	}

	private static Node sortedMergeByName(Node a, Node b) {
		Node result;
		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.data.itemName.compareToIgnoreCase(b.data.itemName) <= 0) {
			result = a;
			result.next = sortedMergeByName(a.next, b);
		} else {
			result = b;
			result.next = sortedMergeByName(a, b.next);
		}
		return result;
	}

	private static Node getMiddle(Node head) {
		if (head == null)
			return head;
		Node slow = head, fast = head.next;
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	// Main method
	public static void main(String[] args) {
		Item i1 = new Item(101, "Laptop", 10, 50000);
		Item i2 = new Item(102, "Keyboard", 50, 1500);
		Item i3 = new Item(103, "Mouse", 100, 800);
		Item i4 = new Item(104, "Monitor", 20, 8000);
		Item i5 = new Item(105, "Printer", 5, 12000);

		addItemAtBegin(i1);
		addItemAtEnd(i2);
		addItemAtPosition(i3, 2);
		addItemAtEnd(i4);
		addItemAtPosition(i5, 3);

		displayInventory();

		// Remove item
		removeItem(102);
		displayInventory();

		// Update quantity
		updateQuantity(103, 120);
		displayInventory();

		// Search item
		searchItem(-1, "Monitor");
		searchItem(101, null);

		// Calculate total value
		calculateTotalValue();

		// Sort by name
		sortByName();
		System.out.println("Inventory sorted by name:");
		displayInventory();
	}
}

package linkedlist;

class Task {
	int taskId;
	String taskName;
	int priority;
	String dueDate;

	Task(int taskId, String taskName, int priority, String dueDate) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
	}
}

class Node {
	Task data;
	Node next;

	Node(Task data) {
		this.data = data;
		this.next = null;
	}
}

public class TaskScheduler {
	private Node tail; // tail.next points to head
	private Node current; // pointer to current task

	// Add task at the beginning
	public void addAtBeginning(Task task) {
		Node newNode = new Node(task);
		if (tail == null) { // Empty list
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next; // new node points to head
			tail.next = newNode; // tail points to new head
		}
		if (current == null)
			current = tail.next; // initialize current
	}

	// Add task at the end
	public void addAtEnd(Task task) {
		Node newNode = new Node(task);
		if (tail == null) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next; // new node points to head
			tail.next = newNode; // old tail points to new node
			tail = newNode; // update tail
		}
		if (current == null)
			current = tail.next;
	}

	// Add task at specific position (1-based)
	public void addAtPosition(Task task, int position) {
		if (position <= 0) {
			System.out.println("Invalid position!");
			return;
		}
		if (position == 1) {
			addAtBeginning(task);
			return;
		}
		Node newNode = new Node(task);
		Node temp = tail.next; // head
		int count = 1;
		while (count < position - 1 && temp != tail) {
			temp = temp.next;
			count++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		if (temp == tail)
			tail = newNode; // inserted at end
	}

	// Remove task by Task ID
	public void removeTask(int taskId) {
		if (tail == null) {
			System.out.println("No tasks to remove.");
			return;
		}

		Node prev = tail;
		Node temp = tail.next; // start from head

		do {
			if (temp.data.taskId == taskId) {
				if (temp == tail && temp == tail.next) {
					// Only one node
					tail = null;
					current = null;
				} else {
					prev.next = temp.next;
					if (temp == tail)
						tail = prev; // remove tail
					if (temp == current)
						current = temp.next; // move current
				}
				System.out.println("Task ID " + taskId + " removed.");
				return;
			}
			prev = temp;
			temp = temp.next;
		} while (temp != tail.next);

		System.out.println("Task ID " + taskId + " not found.");
	}

	// View current task
	public void viewCurrentTask() {
		if (current == null) {
			System.out.println("No tasks available.");
		} else {
			Task t = current.data;
			System.out.println("Current Task -> ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority
					+ ", Due: " + t.dueDate);
		}
	}

	// Move to next task
	public void nextTask() {
		if (current != null)
			current = current.next;
	}

	// Display all tasks starting from head
	public void displayTasks() {
		if (tail == null) {
			System.out.println("No tasks available.");
			return;
		}
		Node temp = tail.next; // head
		System.out.println("Task List:");
		do {
			Task t = temp.data;
			System.out.println(
					"ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority + ", Due: " + t.dueDate);
			temp = temp.next;
		} while (temp != tail.next);
	}

	// Search tasks by priority
	public void searchByPriority(int priority) {
		if (tail == null) {
			System.out.println("No tasks available.");
			return;
		}
		Node temp = tail.next;
		boolean found = false;
		System.out.println("Tasks with Priority " + priority + ":");
		do {
			if (temp.data.priority == priority) {
				Task t = temp.data;
				System.out.println("ID: " + t.taskId + ", Name: " + t.taskName + ", Due: " + t.dueDate);
				found = true;
			}
			temp = temp.next;
		} while (temp != tail.next);
		if (!found)
			System.out.println("No tasks found with this priority.");
	}

	public static void main(String[] args) {
		TaskScheduler scheduler = new TaskScheduler();

		// Adding tasks
		scheduler.addAtEnd(new Task(1, "Complete Assignment", 1, "2026-01-10"));
		scheduler.addAtBeginning(new Task(2, "Prepare Presentation", 2, "2026-01-12"));
		scheduler.addAtPosition(new Task(3, "Team Meeting", 1, "2026-01-11"), 2);

		// Display all tasks
		scheduler.displayTasks();

		// View current task
		scheduler.viewCurrentTask();

		// Move to next task
		scheduler.nextTask();
		scheduler.viewCurrentTask();

		// Search tasks by priority
		scheduler.searchByPriority(1);

		// Remove a task
		scheduler.removeTask(2);
		scheduler.displayTasks();
	}
}

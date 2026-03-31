package linkedlist;

// Node class for doubly linked list
class Node {
    String textState;
    Node next;
    Node prev;

    Node(String textState) {
        this.textState = textState;
        this.next = null;
        this.prev = null;
    }
}

// Text Editor with Undo/Redo
public class TextEditorUndoRedoSystem {
    private Node head;       // first state
    private Node tail;       // last state
    private Node current;    // current state
    private final int MAX_HISTORY = 10;
    private int size = 0;    // number of states

    // Add a new text state
    public void addState(String text) {
        Node newNode = new Node(text);

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        // Remove all redo states after current
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = computeSize();
        }

        // Add new state at end
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history to MAX_HISTORY
        while (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Compute current size of list (used after trimming redo states)
    private int computeSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Undo: move to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: Current Text -> " + current.textState);
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo: move to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: Current Text -> " + current.textState);
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state
    public void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text -> " + current.textState);
        } else {
            System.out.println("No text available.");
        }
    }

    // Display all states (for debugging)
    public void displayHistory() {
        Node temp = head;
        System.out.println("Text History:");
        while (temp != null) {
            if (temp == current) {
                System.out.println("-> " + temp.textState + " (current)");
            } else {
                System.out.println("   " + temp.textState);
            }
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        TextEditorUndoRedoSystem editor = new TextEditorUndoRedoSystem();

        // Simulate typing actions
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! This is a text editor.");
        editor.displayCurrent();
        editor.displayHistory();

        // Undo actions
        editor.undo();
        editor.undo();

        // Redo actions
        editor.redo();

        // Add new state after undo (should remove redo history)
        editor.addState("Hello, World! This is a text editor with undo/redo.");
        editor.displayHistory();

        // Multiple undo to test history limit
        editor.addState("State 5");
        editor.addState("State 6");
        editor.addState("State 7");
        editor.addState("State 8");
        editor.addState("State 9");
        editor.addState("State 10");
        editor.addState("State 11"); // This should remove the oldest state ("Hello")
        editor.displayHistory();
    }
}

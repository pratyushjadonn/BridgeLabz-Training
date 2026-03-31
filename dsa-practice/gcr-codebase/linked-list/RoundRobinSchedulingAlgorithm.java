package linkedlist;

// Process class
class Process {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; // for RR simulation
        this.priority = priority;
    }
}

// Node for circular linked list
class Node {
    Process data;
    Node next;

    Node(Process data) {
        this.data = data;
        this.next = null;
    }
}

// Round-Robin Scheduling using Circular Linked List
public class RoundRobinSchedulingAlgorithm {
    private Node tail; // tail.next is head

    // Add process at the end
    public void addProcess(Process process) {
        Node newNode = new Node(process);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
        } else {
            newNode.next = tail.next; // new points to head
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove a process (after it finishes)
    private void removeProcess(Node prev, Node current) {
        if (current == tail && current.next == tail) { // only one process
            tail = null;
        } else {
            prev.next = current.next;
            if (current == tail) tail = prev; // update tail if needed
        }
    }

    // Display circular queue
    public void displayQueue() {
        if (tail == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Node temp = tail.next;
        System.out.print("Processes in Queue: ");
        do {
            System.out.print("P" + temp.data.processId + "(" + temp.data.remainingTime + ") ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }

    // Simulate Round-Robin Scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int completedProcesses = 0;

        // To keep track of waiting time
        Node current = tail.next; // head
        Node prev = tail;

        System.out.println("Starting Round-Robin Scheduling with Time Quantum = " + timeQuantum);

        while (tail != null) { // while queue not empty
            Process p = current.data;
            int execTime = Math.min(p.remainingTime, timeQuantum);

            System.out.println("Executing Process P" + p.processId + " for " + execTime + " units.");

            // Increment waiting time for other processes
            Node temp = current.next;
            while (temp != current) {
                temp.data.remainingTime = Math.max(0, temp.data.remainingTime);
                temp = temp.next;
            }

            p.remainingTime -= execTime;

            if (p.remainingTime == 0) {
                // process finished
                completedProcesses++;
                int turnAroundTime = p.burstTime; // For simplicity, assuming no arrival time
                int waitingTime = turnAroundTime - p.burstTime;
                totalTurnaroundTime += turnAroundTime;
                totalWaitingTime += waitingTime;

                System.out.println("Process P" + p.processId + " finished execution.");
                Node nextNode = current.next;
                removeProcess(prev, current);
                current = nextNode;
            } else {
                prev = current;
                current = current.next;
            }

            displayQueue();
        }

        double avgWaitingTime = (completedProcesses == 0) ? 0 : (double) totalWaitingTime / completedProcesses;
        double avgTurnaroundTime = (completedProcesses == 0) ? 0 : (double) totalTurnaroundTime / completedProcesses;

        System.out.println("Average Waiting Time = " + avgWaitingTime);
        System.out.println("Average Turnaround Time = " + avgTurnaroundTime);
    }

    // Main method
    public static void main(String[] args) {
        RoundRobinSchedulingAlgorithm rr = new RoundRobinSchedulingAlgorithm();

        // Adding processes
        rr.addProcess(new Process(1, 10, 1));
        rr.addProcess(new Process(2, 4, 2));
        rr.addProcess(new Process(3, 6, 3));
        rr.addProcess(new Process(4, 8, 1));

        rr.displayQueue();

        int timeQuantum = 3;
        rr.simulateRoundRobin(timeQuantum);
    }
}

package TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

public class VehicleQueue {
	private Queue<Integer> queue;
	private int capacity;

	public VehicleQueue(int capacity) {
		this.capacity = capacity;
		queue = new LinkedList<>();
	}

	public void enqueue(int id) {
		if (queue.size() == capacity) {
			System.out.println("Queue Overflow! Vehicle " + id + " rejected");
			return;
		}
		queue.add(id);
		System.out.println("Vehicle " + id + " waiting");
	}

	public Integer dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Queue Underflow! No vehicles");
			return null;
		}
		return queue.poll();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}

package TrafficManager;

public class Roundabout {
	private Vehicle tail;

	public void addVehicle(int id) {
		Vehicle newVehicle = new Vehicle(id);

		if (tail == null) {
			tail = newVehicle;
			tail.next = tail;
		} else {
			newVehicle.next = tail.next;
			tail.next = newVehicle;
			tail = newVehicle;
		}
		System.out.println("Vehicle " + id + " entered roundabout");
	}

	public void removeVehicle() {
		if (tail == null) {
			System.out.println("Roundabout empty");
			return;
		}

		Vehicle head = tail.next;

		if (head == tail) {
			System.out.println("Vehicle " + head.vehicleId + " exited");
			tail = null;
		} else {
			System.out.println("Vehicle " + head.vehicleId + " exited");
			tail.next = head.next;
		}
	}

	public void display() {
		if (tail == null) {
			System.out.println("Roundabout empty");
			return;
		}

		Vehicle temp = tail.next;
		System.out.print("Roundabout: ");
		do {
			System.out.print(temp.vehicleId + " -> ");
			temp = temp.next;
		} while (temp != tail.next);
		System.out.println("(circular)");
	}
}

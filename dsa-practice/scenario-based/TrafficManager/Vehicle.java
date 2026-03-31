package TrafficManager;

public class Vehicle {
	int vehicleId;
	Vehicle next;

	public Vehicle(int vehicleId) {
		this.vehicleId = vehicleId;
		this.next = null;
	}
}

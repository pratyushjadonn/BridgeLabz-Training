package ParcelTracker;

public class Stage {
	String status;
	Stage next;

	public Stage(String status) {
		this.status = status;
		this.next = null;
	}
}

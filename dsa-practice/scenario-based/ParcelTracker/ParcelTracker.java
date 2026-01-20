package ParcelTracker;

public class ParcelTracker {
	private Stage head;

	// Add stage at end
	public void addStage(String status) {
		Stage newStage = new Stage(status);

		if (head == null) {
			head = newStage;
			return;
		}

		Stage temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStage;
	}

	// Add custom checkpoint after a given stage
	public void addCheckpoint(String afterStage, String newStage) {
		Stage temp = head;

		while (temp != null && !temp.status.equals(afterStage)) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Stage not found: " + afterStage);
			return;
		}

		Stage checkpoint = new Stage(newStage);
		checkpoint.next = temp.next;
		temp.next = checkpoint;

		System.out.println("Checkpoint added: " + newStage);
	}

	// Forward tracking
	public void trackParcel() {
		if (head == null) {
			System.out.println("Parcel lost! No tracking information.");
			return;
		}

		System.out.print("Parcel Status: ");
		Stage temp = head;
		while (temp != null) {
			System.out.print(temp.status + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	// Simulate missing/lost parcel
	public void markLostAfter(String stage) {
		Stage temp = head;

		while (temp != null && !temp.status.equals(stage)) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Stage not found.");
			return;
		}

		temp.next = null;
		System.out.println("Parcel lost after stage: " + stage);
	}
}

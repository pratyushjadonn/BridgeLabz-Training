package oceanFleet;

public class Vessel {
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;
	public Vessel(String vesselID,String vessselName,double averageSpeed,String vesselType) {
		// TODO Auto-generated constructor stub
		this.vesselId=vesselID;
		this.vesselName=vessselName;
		this.averageSpeed=averageSpeed;
		this.vesselType=vesselType;
	}
	String getVesselId() {
		return vesselId;
	}
	String getVesselName() {
		return vesselName;
	}
	double getAverageSpeed() {
		return averageSpeed;
	}
	String getVesselType() {
		return vesselType;
	}
	

}

package oceanFleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	private List<Vessel> vesselList=new ArrayList<Vessel>();
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel i:vesselList) {
			if(i.vesselId.equals(vesselId)) {
				return i;
			} 
		}
		return null;
		
	}
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> highPrList=new ArrayList<Vessel>();
		double max=0.0;
		for(Vessel j:vesselList) {
			if(j.averageSpeed>max) {
				max=j.averageSpeed;
			}	
		}
		for(Vessel k:vesselList) {
			if(k.averageSpeed==max) {
				highPrList.add(k);
			}
		}
		return highPrList;
		
	}
	public void displayVessel(Vessel vessel) {
		System.out.println(vessel.vesselId+ " | "+vessel.vesselName+" | "+vessel.vesselType+ " | "+vessel.averageSpeed +" knots");
	}

}

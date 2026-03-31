package oceanFleet;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VesselUtil v = new VesselUtil();
		System.out.println("Enter the number of vessels to be added");
		int number=sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Enter Vessel details");
		for(int i=0;i<number;i++) {
			String input=sc.nextLine();
			String[] in=input.split(":");
			String vesselId =in[0];
			String vesselName = in[1];
			double averageSpeed = Double.parseDouble(in[2]);
			String vesselType =in[3];
			Vessel vessel=new Vessel(vesselId, vesselName, averageSpeed, vesselType);
			v.addVesselPerformance(vessel);
		}
		System.out.println("enter  the Vessel Id to check speed");
		String id = sc.next();
		Vessel ans= v.getVesselById(id);
		if(ans!=null) {
		   v.displayVessel(ans);
		}
		else {
			System.out.println("Vessel Id " + id + " not found");
		}
		System.out.println("High performance vessels are");
		for(Vessel ves:v.getHighPerformanceVessels()) {
			v.displayVessel(ves);
		}
	}

}

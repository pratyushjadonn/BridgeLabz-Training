package scenario.based.FactoryRobotHazardAnalyzer;

import java.util.Scanner;

public class RobotHazardMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RobotHazardAuditor robot=new RobotHazardAuditor();
		try {
		System.out.println("Enter ArmPrecision: (0.0 - 1.0)");
		double armPrecision=sc.nextDouble();
		System.out.println("Enter Worker Density: (1 - 20)");
		int workerDensity=sc.nextInt();
		System.out.println("Enter Machine State:(' Worn','Faulty','Critical')");
		String machineryState =sc.next();
		double ans=robot.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
		System.out.println("Robot Hazard Risk Score : "+ans);
		
		}
		catch (RobotSafetyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
			
	}

}

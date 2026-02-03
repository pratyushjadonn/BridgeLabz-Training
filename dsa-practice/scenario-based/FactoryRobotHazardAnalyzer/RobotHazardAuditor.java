package scenario.based.FactoryRobotHazardAnalyzer;

public class RobotHazardAuditor {
	public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		if(armPrecision>1.0 || armPrecision<0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		if(workerDensity>20 || workerDensity<1) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		
		double hazardRisk;
		if(machineryState.equalsIgnoreCase("Worn")) {
		    hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 1.3);
		}
		else if(machineryState.equalsIgnoreCase("Faulty")) {
			   hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 2.0);
			}
		else if(machineryState.equalsIgnoreCase("Critical")) {
			  hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 3.0);
		}
		else {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		return hazardRisk;
	}

}

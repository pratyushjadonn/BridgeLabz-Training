package scenario.based.AeroVigil;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		String flight[]= flightNumber.split("-");
		if(flight.length!=2) {
			throw new InvalidFlightException("The flight number is Invalid");
		}
		int a=Integer.parseInt(flight[1]);
		if(a<1000 || a>9999) {
			throw new InvalidFlightException("The flight number"+flightNumber +"is invalid");
		}
		return true;
		
	}
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(flightName.equalsIgnoreCase("SpiceJet")) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("Vistara")) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("IndiGo")) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("Air Arabia")) {
			return true;
			
		}
		else {
			throw new InvalidFlightException("The flight name "+flightName+" is invalid ");
		}
	}
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		if(flightName.equalsIgnoreCase("SpiceJet") && passengerCount<=396 && passengerCount>0) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("Vistara") && passengerCount<=615 && passengerCount>0) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("IndiGo") && passengerCount<=230 && passengerCount>0) {
			return true;
			
		}
		else if(flightName.equalsIgnoreCase("Air Arabia") && passengerCount<=130 && passengerCount>0) {
			return true;
			
		}
		else {
			throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
		}
		
	}
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		if(flightName.equalsIgnoreCase("SpiceJet") && currentFuelLevel<=200000 && currentFuelLevel>0) {
			return 200000-currentFuelLevel;
			
		}
		else if(flightName.equalsIgnoreCase("Vistara")&& currentFuelLevel<=300000 && currentFuelLevel>0) {
			return 300000-currentFuelLevel;
			
		}
		else if(flightName.equalsIgnoreCase("IndiGo")&& currentFuelLevel<=250000 && currentFuelLevel>0) {
			return 250000-currentFuelLevel;
			
		}
		else if(flightName.equalsIgnoreCase("Air Arabia")&& currentFuelLevel<150000 && currentFuelLevel>0) {
			return 150000-currentFuelLevel;
			
		}
		else {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}
				
	}
}

package scenario.based.AeroVigil;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter flight details");
		FlightUtil flight=new FlightUtil();
		try {
			String detail=sc.nextLine();
		    String details[]=detail.split(":");
		    
		    String flightNumber=details[0];
		    flight.validateFlightNumber(flightNumber);
		    
		    String flightName=details[1];
		    flight.validateFlightName(flightName);
		    
		    int passengerCount=Integer.parseInt(details[2]);
		    flight.validatePassengerCount(passengerCount, flightName);
		    
		    int currentFuel=Integer.parseInt(details[3]);
		    double ans =flight.calculateFuelToFillTank(flightName, currentFuel);
		    System.out.println("Fuel required to fill the tank:"+ans+" liters");
		    
		}
		catch(InvalidFlightException e){
			System.out.println(e.getMessage());
		}
	}

}

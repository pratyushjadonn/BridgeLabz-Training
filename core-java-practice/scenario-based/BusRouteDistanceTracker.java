package scenario.based;

import java.util.Scanner;

public class BusRouteDistanceTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("WELCOME TO BUS:");
	    int totalDistance = 0;
	    int stopDistance = 7;
	    String choice;
	    while(true) {
	    	System.out.println("Do you want to get off at the next stop?(yes/no)");
	    	choice=scanner.next();
	    	if(choice.equals("yes")) {
	    		totalDistance+=stopDistance;
	    		break;
	    	}
	    	else if(choice.equals("no")) {
	    		totalDistance+=stopDistance;
	    	}
	    	else {
	    		System.out.println("Input response is invalid.(Please enter yes/no");
	    	}
	    	
	    }
	    System.out.println("Total distance travelled : "+totalDistance+" km");
	    
	    
	    }

}

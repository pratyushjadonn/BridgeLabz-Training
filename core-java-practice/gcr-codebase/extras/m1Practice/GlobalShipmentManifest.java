package practice;

import java.util.Scanner;
import java.time.LocalDate;

public class GlobalShipmentManifest {
	static boolean ansy(String str) {
		String ans[]=str.split("\\|");
		if(ans.length!=5) {
			return false;
		}
		if(!ans[0].matches("^SHIP-[1-9]\\d{5}$")) {
			return false;
		}
		if(ans[0].matches(".*(\\d)\\1{3,}.*")){
			return false;
		}
		if(!ans[1].matches("20\\d{2}-\\d{2}-\\d{2}")) {
			return false;
		}
		if(ans[1].matches("20\\d{2}-\\d{2}-\\d{2}")) {
			try {
	            LocalDate.parse(ans[1]);
	        } catch (Exception e) {
	            return false;
	        }
		}
		if(!ans[2].matches("AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT")) {
			return false;
		}
		if(!ans[3].matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?")) {
			return false;
		}
		if(!ans[4].matches("DELIVERED|CANCELLED|IN_TRANSIT")){
			return false;
		}
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    sc.nextLine();
	    
	    String input[]=new String[n];
	    for(int i=0;i<n;i++) {
	    	input[i]=sc.nextLine();
	    }
	    for(int i=0;i<n;i++) {
	    	if(ansy(input[i])) {
	    	System.out.println("COMPLIANT RECORD");
	    	}
	    	else {
	    		System.out.println("NON-COMPLIANT RECORD");
	    	}
	    }
		

	}

}

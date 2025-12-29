package scenario.based;

import java.util.Scanner;

public class FestivalLuckyDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    System.out.println("WELCOME TO DIWALI MELA ");
	    while(true) {
	    	System.out.println("Festival Lucky Draw : Draw a number for win a gift (1-999)");
	    	int n=scanner.nextInt();
	    	if(n%3==0 && n%5==0 && n!=0) {
	    		System.out.println("You win a Gift");
	    	}
	    	else if(n<1 || n>999){
	    		System.out.println("input is invalid");		
	    	}
	    	else {
	    		System.out.println("Sorry try next time");
	    	}
	    }
	}

}

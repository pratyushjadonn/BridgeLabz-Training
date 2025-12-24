package scenario.based;

import java.util.Scanner;

public class ElectionBoothManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int vote1=0,vote2=0,vote3=0;
		while(true) {
		System.out.println("Enter the Age of voter /Enter -1 to exit :");
		int age=sc.nextInt();
		if(age==-1) {
			break;
			}
		if(age>=18) {
			System.out.println("You are Eligible to vote");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.println("Enter your vote:");
            int vote=sc.nextInt();
            if(vote==1) {
            	vote1++;
                }
            else if(vote==2) {
            	vote2++;
                }
            else if(vote==3) {
            	vote3++;
                }
            else {
            	System.out.println("invalid vote");
                }
            }
		else {
			System.out.println("Not eligible to vote");
			}
		}
		System.out.println("\n--- Election Results ---");
	    System.out.println("Candidate A have: " + vote1 + " votes");
	    System.out.println("Candidate B have: " + vote2 + " votes");
	    System.out.println("Candidate C have: " + vote3 + " votes");

	}

}

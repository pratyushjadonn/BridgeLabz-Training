package coreJava;

import java.lang.runtime.TemplateRuntime;
import java.util.Scanner;

public class DistanceYards {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the distance in feet:");
		double distance=scanner.nextInt();
		System.out.println("Distance in feet is "+distance+" while in yards is " +(distance/3)+"and miles is "+(distance/(3*1760)));
		
	}

}

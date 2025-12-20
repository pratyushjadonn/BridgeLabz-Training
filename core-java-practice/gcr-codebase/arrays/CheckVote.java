package arrays;

import java.util.Scanner;

public class CheckVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age[]=new int[10];    
		for(int i=0;i<10;i++) {
			System.out.println("Enter the age of "+(i+1)+" student:");
			age[i]=sc.nextInt();
		}
		for(int j=0;j<age.length;j++) {
			if(age[j]<0) {
				System.out.println("the age of "+(j+1)+" student is invalid");
			}
			if(age[j]<18) {
				System.out.println("The "+(j+1)+" student with the age "+age[j]+" cannot vote.");
			}
			else {
				System.out.println("The "+(j+1)+" student with the age "+age[j]+" can vote.");
			}
		}
		

	}

}

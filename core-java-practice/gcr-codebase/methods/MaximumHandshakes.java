package methods;

import java.util.Scanner;

public class MaximumHandshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n =sc.nextInt();
		System.out.println("The Maximum handshakes of "+n+" Students is "+findHandshakes(n));
		

	}
	static int findHandshakes(int n) {
	   return (n*(n-1))/2;
	}

}

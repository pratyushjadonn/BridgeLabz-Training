package practice;

import java.util.*;

public class keyGeneration {
	static void ansy(String str) {
		if(str==null) {
			System.out.println("Invalid Input (empty string)");
			return;
		}
		if(str.length()<6) {
			System.out.println("Invalid Input (length < 6)");
			return;
		}
		if(str.matches(".*\\d.*")) {
			System.out.println("Invalid Input (contains digits)");
			return;
		}
		if(str.matches(".*\\s.*")) {
			System.out.println("Invalid Input (contains space)");
			return;
		}
		if(str.matches(".*[^a-zA-Z0-9 ].*")) {
			System.out.println("Invalid Input (contains special character)");
			return;
		}
		StringBuilder inp= new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch%2!=0) {
				inp.append(ch);
			}
		}
		inp.reverse();
		StringBuilder ans=new StringBuilder();
		
		for(int i=0;i<inp.length();i++) {
			char c=inp.charAt(i);
			if(i%2==0) {
				ans.append(Character.toUpperCase(c));
			}
			else {
				ans.append(c);
			}
		}
		System.out.println(ans.toString());
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		String[] input=new String[n];
		
		for(int i=0;i<n;i++) {
			input[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			ansy(input[i]);
		}
		
		
		

	}

}

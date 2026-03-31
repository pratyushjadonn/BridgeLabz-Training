package reviews;

import java.util.Scanner;

public class CheckStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str=sc.next();
		System.out.println("Enter the Second String");
		String str2=sc.next();
		Check(str, str2);
	    System.out.println("Concatenate the first string with itself:"+Con(str));
	    System.out.println(" Strings are rotational or not? ");
	    Check(str, str2);
		
		

	}
	static void Check(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("Rotation is not Possible");	
		}
		String ansy="";
		char ch =str2.charAt(0);
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==ch) {
				ansy+=str1.substring(i,str1.length())+str1.substring(0,i);
			}
		}
		if(ansy.equals(str2)) {
			System.out.println("String is Rotational");
		}
		else {
			System.out.println("String is not Rotational");
		}
						
	}
	static String Con(String str) {
		return str+=str;	
	}
	 

}

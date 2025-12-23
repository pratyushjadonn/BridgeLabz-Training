package string;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
        String str=sc.next();
        System.out.println("Enter Second String:");
        String str2=sc.next();
        boolean ans=ansy(str,str2);
        System.out.println(ans);
	}
	static boolean ansy(String str,String str2) {
		if(str.length()!=str2.length()) {
				return false;
		}
		for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)!=str2.charAt(i)) {
        		return false;
        		
        	}
		}
		if(!str.equals(str2)) {
			return false;
		}
		return true;
		
	}

}

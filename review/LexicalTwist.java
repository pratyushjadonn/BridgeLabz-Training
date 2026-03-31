package reviews;

import java.util.Scanner;

public class LexicalTwist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word:");
		String str1=sc.next();
		System.out.println("Enter the Second String:");
		String str2=sc.next();
		System.out.println(checkString(str1, str2));
		
	}
	static String checkString(String str1, String str2) {
	     String reverse="";
	     for(int i=str1.length()-1;i>=0;i--) {
	    	 reverse+=str1.charAt(i);	 
	     }
	     reverse.toLowerCase();
	     if(reverse.equals(str2) || reverse.equals(str2.toLowerCase())) {
	    	 String ans="";
	    	 for(int j=0;j<reverse.length();j++) {
	    		 if(reverse.charAt(j)=='a' || reverse.charAt(j)=='e' || reverse.charAt(j)=='i' || reverse.charAt(j)=='o' || reverse.charAt(j)=='u') {
	    			 ans+='@';
	    		 }
	    		 else {
	    			 ans+=reverse.charAt(j);
	    		 }	 
	    	 }
	    	 return ans;
	     }
	     str1+=str2;
	     str1.toUpperCase();
	     int vowels=0;
	     String vowelString="";
	     String conString="";
	     for(int i=0;i<str1.length();i++) {
	    	 if(str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O' || str1.charAt(i)=='U') {
	    		 vowels++;
	    		 
	    	 }
	    	 
	     }
	     int consonants =str1.length()-vowels;
	     
	     if(vowels > consonants) {   	 
	    	 for(int i=0;i<str1.length();i++) {
		    	 if(str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O' || str1.charAt(i)=='U') {
		    		 if(vowelString.length()<2) {
		    			 vowelString+=str1.charAt(i);
		    		 }
		    		 if(vowelString.length()==2) {
		    			 return vowelString;
		    		 }
		    	  }
		    		     		 
		    }	 
	     }
	     else if(consonants > vowels) {
	    	 for(int i=0;i<str1.length();i++) {
		    	 if(str1.charAt(i)!='A' || str1.charAt(i)!='E' || str1.charAt(i)!='I' || str1.charAt(i)!='O' || str1.charAt(i)!='U') {
		    		 if(vowelString.length()<2) {
		    			 conString+=str1.charAt(i);
		    			 
		    		 }
		    		 if(conString.length()==2){
		    			 return conString;
		    		 }
		    	  }
		    		     		 
		    }	 
	    	 
	     }
	     return "Vowels and consoants are equals";     	
	}

}


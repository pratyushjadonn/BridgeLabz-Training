package review2;
import java.util.*;
public class LexicalTwist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word : ");
		String word1=sc.nextLine();
		if(word1.trim().contains(" ")) {
			System.out.println(word1+" is an invalid word");
			return;
		}
		System.out.println("Enter the second word : ");
		String word2=sc.next();
		if(word2.trim().contains(" ")) {
			System.out.println(word2+" is an invalid word");
			return;
		}
		boolean check=checkWords(word1,word2);
		if(check) {
			String word3=reverse(word1);
			replaceVowel(word3);
		}
		else {
			combineAndProcess(word1,word2);
		}
		
		
	}
	public static boolean checkWords(String word1,String word2) {
		if(word1.length()!=word2.length()) {
			return false;
		}
		word1=word1.toLowerCase();
		word2=word2.toLowerCase();
		int i=0;
		int j=word1.length()-1;
		while(i!=word1.length()) {
			if(word1.charAt(i)!=word2.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	public static String reverse(String word) {
		StringBuilder sb=new StringBuilder();
		int j=word.length()-1;
		while(j>=0) {
			sb.append(word.charAt(j));
			j--;
		}
		return sb.toString();
	}
	public static void replaceVowel(String word) {
		word=word.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u') {
				sb.append('@');
			}
			else {
				sb.append(word.charAt(i));
			}
		}
		System.out.println("Word 1 after replacing vowels is : "+sb.toString());
	}
	public static void combineAndProcess(String word1,String word2) {
		String word=word1+word2;
		word=word.toUpperCase();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		if(vowel>consonant) {
			int k=0;
			int count=0;
			char first='@';
			System.out.println("Two vowels are : ");
			while(k<word.length() && count<2) {
				if(word.charAt(k)=='A' || word.charAt(k)=='E' || word.charAt(k)=='I' || word.charAt(k)=='O' || word.charAt(k)=='U') {
					if(count==0) {
						System.out.print(word.charAt(k));
						first=word.charAt(k);
						count++;
					}
					if(count==1) {
						if(word.charAt(k)!=first) {
							System.out.println(word.charAt(k));
							count++;
						}
					}
				}
				k++;
			}
		}
		else if(consonant>vowel) {
			int k=0;
			int count=0;
			char first='@';
			System.out.println("Two consonants are : ");
			while(k<word.length() && count<2) {
				if(word.charAt(k)!='A' && word.charAt(k)!='E' && word.charAt(k)!='I' && word.charAt(k)!='O' && word.charAt(k)!='U') {
					if(count==0) {
						System.out.print(word.charAt(k));
						first=word.charAt(k);
						count++;
					}
					if(count==1) {
						if(word.charAt(k)!=first) {
							System.out.println(word.charAt(k));
							count++;
						}
					}
				}
				k++;
			}
		}
		else {
			System.out.println("Vowel and consonants are equal");
		}
	}
	
	
}

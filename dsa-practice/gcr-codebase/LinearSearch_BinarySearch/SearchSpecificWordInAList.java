package linearsearch_binarysearch;
import java.util.*;
public class SearchSpecificWordInAList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		sc.nextLine();
		String[] sentences=new String[n];
		System.out.println("Enter sentences for the array ");
		for(int i=0;i<sentences.length;i++) {
			sentences[i]=sc.nextLine();
		}
		System.out.print("Enter a word : ");
		String findWord=sc.next();
		//method call
		String ans=searchForASpecificWord(sentences,findWord);
		//output
		System.out.println(ans);
		
	}
	//method to search a sentence with a specific word
	public static String searchForASpecificWord(String[] sentences,String findWord) {
		for(int i=0;i<sentences.length;i++) {
			String[] sentence=sentences[i].split(" ");
			for(String word:sentence) {
				if(word.equals(findWord)) {
					return sentences[i];
				}
			}
		}
		return "Not Found";
	}
}

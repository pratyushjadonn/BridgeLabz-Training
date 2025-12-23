package string;
import java.util.Scanner;
public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to find length:");
		String str=sc.next();
		int userLength=findLength(str);
		int builtLength=str.length();
		System.out.println("Length using user-defined method : "+userLength);
		System.out.println("Length using built-in Length() Method : "+builtLength);
	}
	static int findLength(String str) {
		int count=0;
		try {
			while(true) {
				str.charAt(count);
				count++;
				
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			return count;
		}
	}

}

package runtime_analysis_big_o_notation;
import java.util.*;
public class StringConcatenation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the sstring array : ");
		int size=sc.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]="Hello World!";
		}
		long startTime=System.nanoTime();
		stringConcatenation(arr);
		long endTime=System.nanoTime();
		long timeTaken=endTime-startTime;
		System.out.println("Time taken by string for concatenation "+timeTaken/1000000.0+" ms");
		startTime=System.nanoTime();
		stringBuilderConcatenation(arr);
		endTime=System.nanoTime();
		timeTaken=endTime-startTime;
		System.out.println("Time taken by string builder for concatenation "+timeTaken/1000000.0+" ms");
		startTime=System.nanoTime();
		stringBufferConcatenation(arr);
		endTime=System.nanoTime();
		timeTaken=endTime-startTime;
		System.out.println("Time taken by string buffer for concatenation "+timeTaken/1000000.0+" ms");
	}
	//concatenation using string only
	public static String stringConcatenation(String[] arr) {
		String ans="";
		int n=arr.length;
		for(int i=0;i<n;i++) {
			ans+=arr[i];
		}
		return ans;
	}
	//concatenation using string builder
	public static String stringBuilderConcatenation(String[] arr) {
		StringBuilder sb=new StringBuilder();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	//concatenation using string buffer
	public static String stringBufferConcatenation(String[] arr) {
		StringBuffer sb=new StringBuffer();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}

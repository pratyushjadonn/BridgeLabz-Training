package runtime_analysis_big_o_notation;
import java.util.*;
public class RecursiveVsIterativeFibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		long startTime=System.nanoTime();
		iterativeFibonacci(n);
		long endTime=System.nanoTime();
		long timeTaken=endTime-startTime;
		System.out.println("Time taken by iterative approach to find fibonacci "+timeTaken/1000000.0+" ms");
		startTime=System.nanoTime();
		recursiveFibonacci(n);
		endTime=System.nanoTime();
		timeTaken=endTime-startTime;
		System.out.println("Time taken by recursive approach to find fibonacci "+timeTaken/1000000.0+" ms");
	}
	//iterative approach to find fibonacci
	public static int iterativeFibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	//recursive approach to find fibonacci
	public static int recursiveFibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
}

package linearsearch_binarysearch;
import java.util.*;
public class SearchFirstNegativeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//method call
		int index=findFirstNegativeNumber(arr);
		System.out.println(index);
	}
	//method to find first negative number
	public static int findFirstNegativeNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				return i;
			}
		}
		return -1;
	}
}

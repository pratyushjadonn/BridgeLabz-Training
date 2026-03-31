package linearsearch_binarysearch;
import java.util.*;
public class RotationPoint {
	public static void main(String[] args) {
		//integer array
		int[] arr= {3,4,5,1,2};
		//start and end variables
		int s=0;
		int e=arr.length-1;
		while(s!=e) {
			int m=s+(e-s)/2;
			//condition
			if(arr[m]>arr[s]) {
				s=m+1;
			}
			else {
				e=m;
			}
		}
		System.out.println(arr[s]);
	}

}

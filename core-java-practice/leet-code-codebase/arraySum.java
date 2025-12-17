import java.util.*;
public class arraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        sum=ansy(arr,sum);
        System.out.println(sum);

    }
    static int ansy(int[] arr,int sum){
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
}

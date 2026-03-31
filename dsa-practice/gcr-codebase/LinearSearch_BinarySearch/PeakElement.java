package linearsearch_binarysearch;
public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,8,3,6,2,3,4,5,1,3};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // check left and right safely
            boolean leftOk=(mid==0) || arr[mid]>arr[mid-1];
            boolean rightOk=(mid==arr.length-1) || arr[mid]>arr[mid+1];
            if (leftOk && rightOk) {
                System.out.println("Peak element:" + arr[mid]);
                return;
            }
            // move towards higher side
            if (mid>0 && arr[mid]<arr[mid-1]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        System.out.println("No peak element");
    }
}

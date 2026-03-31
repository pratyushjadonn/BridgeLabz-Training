package linearsearch_binarysearch;
import java.util.*;
public class SearchTargetInTwoDSortedMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row=sc.nextInt();
		System.out.print("Enter number of columns : ");
		int column=sc.nextInt();
		int[][] matrix=new int[row][column];
		System.out.println("Enter rowwise elements of array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter target value");
		int target=sc.nextInt();
		//method call
		boolean valueFound=searchMatrix(matrix,target);
		System.out.println("Target value found in the matrix ? "+valueFound);
	}
	//method to search target in 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=rows*cols-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            int row=mid/cols;
            int col=mid%cols;
            int midElement=matrix[row][col];
            if (midElement==target) {
                return true;
            } else if (target<midElement) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return false;
    }
	
}

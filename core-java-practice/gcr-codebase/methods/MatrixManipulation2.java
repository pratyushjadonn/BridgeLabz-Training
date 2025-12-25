package methods;
import java.util.*;
public class MatrixManipulation2 {
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(3, 3);
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Transpose of Matrix:");
        displayMatrix(transpose);
        int determinant2x2 = determinant2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2);
        int determinant3x3 = determinant3x3(matrix);
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3);
        double[][] inverse2x2 = inverse2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});
        System.out.println("Inverse of 2x2 Matrix:");
        displayMatrix(inverse2x2);
    }
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}
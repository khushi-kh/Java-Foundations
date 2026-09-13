package day4;

import java.util.Arrays;

public class MatrixSum {

    public static int[] rowSum(int[][] matrix) {

        int[] result = new int[matrix.length];

        for (int i=0; i< matrix.length; i++) {

            int sum = 0;

            for (int j=0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            result[i] = sum;
        }

        return result;
    }

    public static int[] colSum(int[][] matrix) {
        int maxColSize = 0;

        for (int[] row : matrix) {
            maxColSize = Math.max(maxColSize, row.length);
        }

        int[] result = new int[maxColSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j] += matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,13}
        };

        System.out.println(Arrays.toString(rowSum(matrix)));
        System.out.println(Arrays.toString(colSum(matrix)));
    }
}

package day4;

import java.util.Arrays;

public class Diagonal {

//    public static int[] primary(int[][] matrix) {
//
//        int[] result = new int[matrix.length];
//
//        for (int i=0; i<matrix.length; i++) {
//            result[i] = matrix[i][i];
//        }
//
//        return result;
//    }
//
//    public static int[] secondary(int[][] matrix) {
//
//        int[] result = new int[matrix.length];
//
//        int i = 0;
//        int j = matrix.length-1;
//
//        while (i < matrix.length && j >=0) {
//
//            result[i] = matrix[i][j];
//            i++;
//            j--;
//        }
//
//        return result;
//    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;

        int[] pri = new int[n];
        int[] sec = new int[n];

        /* While loop approach

        int i = 0;
        int j = n-1;

        while (i < n && j >=0) {

            pri[i] = matrix[i][i];
            sec[i] = matrix[i][j];

            i++;
            j--;
        }
        */

        // for loop approach

        for (int i=0; i< n; i++) {
            pri[i] = matrix[i][i];
            sec[i] = matrix[i][n - 1- i];
        }

//        System.out.println(Arrays.toString(primary(matrix)));
//        System.out.println(Arrays.toString(secondary(matrix)));

        System.out.println(Arrays.toString(pri));
        System.out.println(Arrays.toString(sec));

    }
}

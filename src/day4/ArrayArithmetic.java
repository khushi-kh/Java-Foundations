package day4;

public class ArrayArithmetic {

    public static long total(int[] arr){

        if (arr == null) throw new IllegalArgumentException("Array cannot be null");

        if (arr.length == 0) return 0;

        long result = 0;

        for (long num: arr) {
            result += num;
        }

        return result;
    }

    public static double average(int[] arr) {

        if (arr == null) throw new IllegalArgumentException("Array cannot be null");

        if (arr.length == 0) throw new IllegalArgumentException("Array can't be empty");

        double sum = total(arr);

        return sum/arr.length;
    }

    public static int maximum(int[] arr) {

        if (arr == null) throw new IllegalArgumentException("Array cannot be null");

        if (arr.length == 0) throw new IllegalArgumentException("Array can't be empty");

        int highest = arr[0];

        for (int i = 1; i<arr.length; i++) {

            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        return highest;
    }

    public static int minimum(int[] arr) {

        if (arr == null) throw new IllegalArgumentException("Array cannot be null");

        if (arr.length == 0) throw new IllegalArgumentException("Array can't be empty");

        int lowest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        return lowest;
    }

    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5,6,7,8,9,10};

       try {
           System.out.println("Sum of array: " + total(arr));
           System.out.println("Average of array: " + average(arr));
           System.out.println("Maximum value in the array: " + maximum(arr));
           System.out.println("Minimum value in the array: " + minimum(arr));
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }

    }
}

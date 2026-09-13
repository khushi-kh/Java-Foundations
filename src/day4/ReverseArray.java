package day4;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {

        if (arr==null){
            throw new IllegalArgumentException("Array cannot be null");
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = null;

        try{
            System.out.println("Original Array: " + Arrays.toString(arr1));
            System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr1)));

            System.out.println();

            System.out.println("Original Array: " + Arrays.toString(arr2));
            System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr2)));

            System.out.println();

            System.out.println("Original Array: " + Arrays.toString(arr3));
            System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr3)));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

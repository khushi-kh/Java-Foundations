package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateAList {

    private static void reverseList(List<Integer> integers){

        int left = 0;
        int right = integers.size() - 1;

        while (left < right) {

            int temp = integers.get(left);
            integers.set(left, integers.get(right));
            integers.set(right, temp);

            left++;
            right--;
        }

    }

    public static void rotateList(List<Integer> integers, int k) {

        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        if (integers.isEmpty()) return;

        int n = integers.size();

        k = Math.floorMod(k, n);

        if (k == 0) return;

        reverseList(integers);
        reverseList(integers.subList(0,k));
        reverseList(integers.subList(k, n));

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        System.out.print("Enter the value of k: ");

        int k = scanner.nextInt();

        System.out.printf("Original Array: %s %n", integers);

        rotateList(integers, k);

        System.out.printf("Array rotated by %d places: %s %n",k, integers);

    }
}

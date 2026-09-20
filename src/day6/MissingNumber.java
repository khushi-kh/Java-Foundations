package day6;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static int missingNumber(List<Integer> numbers,int n) {

        int expectedSum = (n * (n+1)) / 2;
        int actualSum = 0;

        for (int num: numbers) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        int n = 7;

        System.out.println("The missing number is: " + missingNumber(numbers, n));
    }
}

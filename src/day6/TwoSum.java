package day6;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> sumMap = new HashMap<>();

        for (int i=0; i<numbers.length; i++){

            int num = numbers[i];

            if (sumMap.containsKey(target-num)) {
                return new int[]{sumMap.get(target-num), i};
            } else {
                sumMap.put(num, i);
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {

        int[] numbers = {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}

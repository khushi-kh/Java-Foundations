package day4;

import java.util.HashMap;


public class Frequency {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,5,6,5,6,6,4,1,1,6};

        HashMap<Integer, Integer> freq = new HashMap<>();

        int maxElement = arr[0];
        int maxFreq = 0;

        for (int num: arr) {
            // If num in freq, add 1 to value; if not; create new entry with 1 as value
            // If num is not in the map, it inserts num → 1 and returns 1.
            //If num is already present, it adds 1 to its current frequency and returns that new count.
            int count = freq.merge(num, 1, Integer::sum);

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = num;
            }
        }

        System.out.println("Element with max frequency: " + maxElement);
        System.out.println("Max Frequency: " + maxFreq);
    }
}

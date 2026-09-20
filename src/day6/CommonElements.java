
package day6;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {

        Set<Integer> commonElements = new HashSet<>();

        if (arr1 == null || arr2 == null) {
            return commonElements;
        }

        Set<Integer> setA = new HashSet<>();

        for (int num : arr1) {
            setA.add(num);
        }

        for (int num : arr2) {
            if (setA.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {9, 8, 7, 6, 5, 4};

        Set<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println(commonElements);
    }
}
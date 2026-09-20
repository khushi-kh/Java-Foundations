package day6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subset {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {

        for (int num: set1) {
            if (!set2.contains(num)) {
                return false;
            }
        }

        return true;

        // approach 2: set2.containsAll(set1)
    }


    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(List.of(1,2,3,4,5));

        if (isSubset(set1, set2)) {
            System.out.println("Set 1 is a subset of Set 2");
        } else {
            System.out.println("Set 1 is NOT a subset of Set 2");
        }
    }
}



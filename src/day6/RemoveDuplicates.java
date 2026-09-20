package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> arrayList) {

        Set<Integer> seen = new HashSet<>();
        int writeIndex = 0;

        for (int num: arrayList) {

            if (seen.add(num)) {
                arrayList.set(writeIndex, num);
                writeIndex++;
            }
        }

        arrayList.subList(writeIndex, arrayList.size()).clear();

        return arrayList;
    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);

        System.out.println(arrayList);
        System.out.println(removeDuplicates(arrayList));

    }
}

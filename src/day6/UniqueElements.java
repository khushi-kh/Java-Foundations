package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);

        Set<Integer> uniqueElements = new HashSet<>(numbers);

        for (int num: uniqueElements) {
            System.out.println(num);
        }
    }
}

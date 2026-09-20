
package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class SecondLargest {

    public static OptionalInt secondLargest(List<Integer> numbers) {

        if (numbers == null) {
            return OptionalInt.empty();
        }

        int largest = 0;
        int secondLargest = 0;

        boolean hasLargest = false;
        boolean hasSecondLargest = false;

        for (int number : numbers) {

            if (!hasLargest || number > largest) {

                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }

                largest = number;
                hasLargest = true;

            } else if (number < largest &&
                    (!hasSecondLargest || number > secondLargest)) {

                secondLargest = number;
                hasSecondLargest = true;
            }
        }

        if (hasSecondLargest) {
            return OptionalInt.of(secondLargest);
        }

        return OptionalInt.empty();
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(6);

        OptionalInt result = secondLargest(numbers);

        if (result.isPresent()) {
            System.out.printf(
                    "Second largest number is %d%n",
                    result.getAsInt()
            );
        } else {
            System.out.println("No second largest value found");
        }
    }
}
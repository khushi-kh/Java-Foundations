package day6;

import java.util.*;

public class FirstUniqueChar {

    public static Optional<Character> firstUniqueChar(String str) {

        if (str.isBlank()) return Optional.empty();

        String formatted = str
                .replaceAll("[\\p{P}\\p{S}]", " ") // remove punctuations and special chars.
                .toLowerCase(Locale.ROOT)
                .replaceAll("(?U)\\s+", "");

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (int i=0; i<formatted.length(); i++) {

            char key = formatted.charAt(i);

            freq.merge(key, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

            if (entry.getValue() == 1) {
                return Optional.of(entry.getKey());
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = sc.nextLine();

        Optional<Character> result = firstUniqueChar(str);

        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("No unique character found");
        }

    }
}

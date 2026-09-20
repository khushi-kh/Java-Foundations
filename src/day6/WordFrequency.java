package day6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> freq = new HashMap<>();

        System.out.print("Enter the sentence: ");

        String sentence = sc.nextLine();

        if (sentence.isBlank()) {
            System.out.println("Empty string.");
        } else {
            String formatted = sentence
                    .replaceAll("[\\p{P}\\p{S}]", " ") // remove punctuations and special chars.
                    .toLowerCase(Locale.ROOT)
                    .strip();

            if (formatted.isEmpty()) {
                System.out.println("The string only contains special characters.");
            } else {
                String[] wordArray = formatted.split("(?U)\\s+"); // split at whitespace (include tab, newline)

                for (String str: wordArray) {

                    freq.merge(str, 1, Integer::sum);
                }

                System.out.println(freq);
            }
        }
    }
}

package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    public static Map<Character, Integer> buildFrequencyMap(String str) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq.merge(ch, 1, Integer::sum);
        }

        return freq;
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> str1Freq = buildFrequencyMap(str1);
        Map<Character, Integer> str2Freq = buildFrequencyMap(str2);

        return str1Freq.equals(str2Freq);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}

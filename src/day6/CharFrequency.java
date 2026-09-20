package day6;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> freq = new HashMap<>();

        System.out.print("Enter the string: ");

        String str = sc.nextLine().toLowerCase(Locale.ROOT).replace(" ", "");

        for (int i=0; i<str.length(); i++) {

            char key = str.charAt(i);

            freq.merge(key,1, Integer::sum);
        }

        System.out.println(freq);
    }
}

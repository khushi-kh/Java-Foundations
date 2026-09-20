package day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseStringDeque {

    public static String reverseString(String str) {

        Deque<Character> charDeque = new ArrayDeque<>(str.length());

        for (int i=0; i<str.length(); i++) {

            charDeque.addFirst(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        for (char ch: charDeque) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String str = sc.nextLine();

        System.out.printf("Original string: %s %n", str);
        System.out.printf("Reversed string: %s %n", reverseString(str));

    }
}

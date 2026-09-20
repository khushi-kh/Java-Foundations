package day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.Scanner;

public class PalindromeDeque {

    public static boolean isPalindrome(String str){

        String normalized = str.toLowerCase(Locale.ROOT);

        int size = normalized.length();

        Deque<Character> characters = new ArrayDeque<>(size);

        for (int i=0; i<size; i++) {

            characters.add(normalized.charAt(i));
        }

        while (characters.size() > 1) {

            char head = characters.removeFirst();
            char tail = characters.removeLast();

            if (head != tail) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String str = sc.nextLine();

        if (isPalindrome(str)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

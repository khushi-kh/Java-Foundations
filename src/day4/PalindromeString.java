package day4;

import java.util.Scanner;

public class PalindromeString {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");

        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is NOT a palindrome", str);
        }

        sc.close();
    }
}

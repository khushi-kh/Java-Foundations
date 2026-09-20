package day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {

    public static boolean isBalanced(String str) {

        int size = str.length();

        Deque<Character> stack = new ArrayDeque<>(size);


        for (int i=0; i<size; i++) {

            char current = str.charAt(i);

            if (current == '(' || current == '{' || current == '[') {

                switch (current) {

                    case '(' -> stack.push(')');
                    case '[' -> stack.push(']');
                    case '{' -> stack.push('}');
                }

            } else {
                if (stack.isEmpty() || stack.pop() != current) return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bracket string: ");
        String brackets = sc.nextLine();

        System.out.println(isBalanced(brackets));

        sc.close();
    }
}

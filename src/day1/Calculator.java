package day1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation you want to perform");
        System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");

        int operation = sc.nextInt();

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        switch (operation){

            case 1 -> System.out.println(num1+num2);
            case 2 -> System.out.println(num1-num2);
            case 3 -> System.out.println(num1*num2);
            case 4 -> System.out.println((double) num1/num2);
        }

        sc.close();
    }
}

// TODO 1: Finish the program when user says exit
// TODO 2: Handle Zero Division
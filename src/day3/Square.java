package day3;
import java.util.Scanner;

public class Square {

    int findSquare(int number) {

        return number*number;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        Square obj = new Square();

        int sq = obj.findSquare(number);

        System.out.printf("The square of the number %d is %d", number, sq);

        sc.close();
    }
}

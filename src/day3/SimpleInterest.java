package day3;
import java.util.Scanner;

public class SimpleInterest {

    double simpleInterest(double principal, double rate, double time) {

        double si = (principal * rate * time) / 100;
        return si;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");

        double p = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");

        double r = sc.nextDouble();

        System.out.print("Enter the time in years: ");

        double t = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();

        double result = obj.simpleInterest(p,r,t);

        System.out.printf("Total calculated interest amount is %.2f", result);

        sc.close();
    }
}

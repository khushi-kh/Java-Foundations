//Ask the user for units consumed and calculate the bill

package day2;
import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");

        double electricityUnits = sc.nextDouble();

        if (electricityUnits < 0) {
            System.out.println("Number of units consumed must be positive");
        } else if (electricityUnits <= 100) {
            System.out.println("Bill generated: " + 5 * electricityUnits);
        } else if (electricityUnits <= 200) {
            System.out.println("Bill generated: " + 7 * electricityUnits);
        } else if (electricityUnits <= 300) {
            System.out.println("Bill generated: " + 10 * electricityUnits);
        }else {
            System.out.println("Bill generated: " + 12 * electricityUnits);
        }
        sc.close();
    }
}

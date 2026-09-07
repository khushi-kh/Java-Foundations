package day1;
import java.util.Scanner;


public class TemperatureConvertor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Convertor");

        System.out.print("Enter temperature in Celsius: ");

        double temp_c = sc.nextDouble();

        double temp_f = (temp_c * 9/5) + 32;

        System.out.printf("Temperature in Celsius: %.2f°C\nTemperature in Fahrenheit: %.2f°F",
                temp_c, temp_f);

        sc.close();
    }

}

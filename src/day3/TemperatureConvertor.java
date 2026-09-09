package day3;
import java.util.Scanner;

public class TemperatureConvertor {

    double celsiusToFahrenheit(double tempInCelsius) {

        return (tempInCelsius * 9.0/5) + 32;
    }

    double fahrenheitToCelsius(double tempInFahrenheit) {

        return (tempInFahrenheit - 32) * 5.0/9;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        TemperatureConvertor obj = new TemperatureConvertor();

        System.out.println("Choose your convertor\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Celsius to Fahrenheit Convertor");

                System.out.print("Enter the temperature in Celsius: ");

                double temp  = sc.nextDouble();

                double result = obj.celsiusToFahrenheit(temp);

                System.out.printf("%.2f°C = %.2f°F", temp, result);
            }
            case 2 -> {
                System.out.println("Fahrenheit to Celsius Convertor");

                System.out.print("Enter the temperature in Fahrenheit: ");

                double temp  = sc.nextDouble();

                double result = obj.fahrenheitToCelsius(temp);

                System.out.printf("%.2f°F = is %.2f°C", temp, result);
            }
        }

        sc.close();
    }
}

package day2;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = RandomGenerator.getDefault().nextInt(1,101);
        int chances = 5;
        int attempts = 0;

        while (chances >=1) {

            System.out.println("Guess the number: ");

            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Choose a number between 1 and 100");
                continue;
            }

            attempts++;
            if (guess != secretNumber) {
                if (guess < secretNumber) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Your guess is too high");
                }
                chances--;
            } else {
                System.out.printf("You guessed the number correctly in %d attempts", (attempts));
                break;
            }
        }
        if (chances == 0) {
            System.out.printf("Attempts exhausted. The correct number was %d", secretNumber);
        }

        sc.close();
    }
}

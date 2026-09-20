package day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicketCounter {

    public static void addPerson(Deque<String> queue, String person) {
        queue.offerLast(person);
    }

    public static String servePerson(Deque<String> queue) {
        return queue.pollFirst();
    }

    public static String viewNextPerson(Deque<String> queue) {
        return queue.peekFirst();
    }

    public static void displayQueue(Deque<String> queue) {
        System.out.println("Current queue: " + queue);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();

        System.out.println("Welcome to the ticket counter!");

        int choice = 0;

        while (choice != 5) {

            System.out.println("""
                    
                    1. Add a person to the queue
                    2. Serve the next person
                    3. View the next person
                    4. Display the entire queue
                    5. Exit
                    """);

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter the name of the person: ");
                    String person = scanner.nextLine().strip();

                    if (person.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                    } else {
                        addPerson(queue, person);
                        System.out.println(person + " has been added to the queue.");
                    }
                }

                case 2 -> {
                    String person = servePerson(queue);

                    if (person == null) {
                        System.out.println("Queue is empty. Nobody to serve.");
                    } else {
                        System.out.println("Serving " + person);
                    }
                }

                case 3 -> {
                    String person = viewNextPerson(queue);

                    if (person == null) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Next person: " + person);
                    }
                }

                case 4 -> displayQueue(queue);

                case 5 -> System.out.println("Exiting the system...");

                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
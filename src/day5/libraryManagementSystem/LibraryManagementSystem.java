package day5.libraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the Booknest library.");

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 8) {

            System.out.println("""
                1. Add a book
                2. Register a member
                3. View all books
                4. View all members
                5. Borrow a book
                6. Return a book
                7. View a Member's borrowed books
                8. Exit""");
            System.out.println();

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Invalid Input");
                sc.nextLine();
                continue;
            }
            System.out.println();

            switch (choice) {

                case 1 -> ExceptionHandler.runSafely(() ->{

                    System.out.print("Enter book id: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // clears the newline char left behind by nextInt

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter total copies: ");
                    int total = sc.nextInt();
                    sc.nextLine();

                    Book book = new Book(bookId, title, author, total);
                    library.addBook(book);
                    System.out.println();
                });


                case 2 -> ExceptionHandler.runSafely(() ->{

                    System.out.print("Enter Member Id: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.println("""
                            Enter membership type
                            1. Student Member
                            2. Regular Member
                            3. Premium Member""");
                    int membershipType = sc.nextInt();

                    Member member = switch (membershipType) {
                        case 1 -> new StudentMember(memberId, name);
                        case 2 -> new RegularMember(memberId, name);
                        case 3 -> new PremiumMember(memberId, name);
                        default -> throw new IllegalArgumentException("Invalid choice");
                    };

                    library.registerMember(member);
                    System.out.println();
                });


                case 3 -> ExceptionHandler.runSafely(() -> {
                    library.showAllBooks();
                    System.out.println();
                });


                case 4 -> ExceptionHandler.runSafely(() -> {
                    library.viewAllMembers();
                    System.out.println();
                });


                case 5 -> ExceptionHandler.runSafely(() ->{

                    System.out.print("Enter member Id: ");
                    int memberId = sc.nextInt();

                    System.out.print("Enter book Id: ");
                    int bookId = sc.nextInt();

                    library.borrowABook(memberId, bookId);
                    System.out.println();
                });


                case 6 -> ExceptionHandler.runSafely(() -> {

                    System.out.print("Enter member Id: ");
                    int memberId = sc.nextInt();

                    System.out.print("Enter book Id: ");
                    int bookId = sc.nextInt();

                    library.returnABook(memberId, bookId);
                    System.out.println();
                });


                case 7 -> ExceptionHandler.runSafely(() -> {

                    System.out.println("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    library.memberBorrowedBooks(memberId);
                    System.out.println();


                });

                case 8 -> {
                    System.out.println("Exiting the system.....");
                    System.out.println();
                }


                default -> {
                    System.out.println("Invalid choice, try again");
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
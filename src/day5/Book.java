package day5;

public class Book {

    private final String title;
    private final String author;
    private double price;

    Book() {

        this("Default Book Title", "Anonymous", 0);
    }

    Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Book Details");
        System.out.println("----------------------");
        System.out.printf("Title: %s, Author: %s, Price: %.2f %n", title, author, price);
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Kafka on the Shore", "Haruki Murakami", 599);

        book2.price = 699;
        // book2.title = "Hello"; Not Possible because title is final

        book1.displayDetails();
        book2.displayDetails();
    }
}

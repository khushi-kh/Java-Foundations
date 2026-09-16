package day5.libraryManagementSystem;

public class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private final int totalCopies;
    private int availableCopies;

    public Book(int bookId, String title, String author, int totalCopies) {

        if (totalCopies < 1) {
            throw new IllegalArgumentException("Total copies must be positive.");
        }

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }


    void decreaseAvailableCopies() {
        if (availableCopies <= 0) {
            throw new IllegalStateException("No copies are available.");
        }
        availableCopies--;
    }

    void increaseAvailableCopies() {
        if (availableCopies >= totalCopies) {
            throw new IllegalStateException("All copies are already available.");
        }
        availableCopies++;
    }

}
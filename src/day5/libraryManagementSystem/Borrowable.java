package day5.libraryManagementSystem;

public interface Borrowable {

    boolean canBorrow(Book book);
    boolean borrowBook(Book book);
    boolean returnBook(Book book);
}

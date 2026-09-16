package day5.libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {

    private final Map<Integer, Book> books = new HashMap<>();

    private final Map<Integer, Member> members = new HashMap<>();


    public void addBook(Book book) {

        if (books.containsKey(book.getBookId())) {
            throw new IllegalArgumentException("Book " + book.getBookId() + " already exists");
        }

        books.put(book.getBookId(), book);
        System.out.println("Book added successfully.");
    }


    public void showAllBooks() {

        if (books.isEmpty()) {
            System.out.println("No books added yet.");
        } else {

            for (Map.Entry<Integer, Book> entry: books.entrySet()) {
                Book book = entry.getValue();

                displayBooks(book);
                System.out.println("Total copies: " + book.getTotalCopies());
                System.out.println("Available copies: " + book.getAvailableCopies());
            }
        }
    }


    public void registerMember(Member member) {

        if (members.containsKey(member.getMemberId())) {
            throw new IllegalArgumentException("Member " + member.getMemberId() + " " + member.getName() + " already exists");
        }

        members.put(member.getMemberId(), member);

        System.out.println("Member registered successfully.");
    }


    public void viewAllMembers() {

        if (members.isEmpty()) {
            System.out.println("No members yet.");
        } else {
            for (Map.Entry<Integer, Member> entry : members.entrySet()) {

                Member member = entry.getValue();

                displayMember(member);
            }
        }
    }



    public void borrowABook(int memberId, int bookId) {


        Member member = members.get(memberId);
        Book book = books.get(bookId);

        if (member == null) {
            System.out.println("No member found with ID: " + memberId);
            return;
        }

        if (book == null) {
            System.out.println("No book found with ID: " + bookId);
            return;
        }

        if (member.borrowBook(book)) {

            book.decreaseAvailableCopies();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Operation Failed.");
        }
    }


    public void returnABook(int memberId, int bookId) {
        Member member = members.get(memberId);
        Book book = books.get(bookId);

        if (member == null) {
            System.out.println("No member found with ID: " + memberId);
            return;
        }

        if (book == null) {
            System.out.println("No book found with ID: " + bookId);
            return;
        }

        if (member.returnBook(book)) {

            book.increaseAvailableCopies();
            System.out.println("Book returned successfully");
        }else {
            System.out.println("Operation failed.");
        }
    }


    public void memberBorrowedBooks(int memberId) {

        Member member = members.get(memberId);

        if (member == null) {
            System.out.println("No member found with ID: " + memberId);
            return;
        }

        Set<Integer> borrowedBooks = member.viewBorrowedBooks();

        for (int id: borrowedBooks) {
            Book book = books.get(id);
            displayBooks(book);
        }
    }


    private void displayMember(Member member) {
        System.out.println("Member Id: " + member.getMemberId());
        System.out.println("Name: " + member.getName());
        System.out.println("Membership Type: " + member.getClass().getSimpleName());
        System.out.println("Membership fee: " + member.calculateMembershipFee());
        System.out.println("Borrowing Limit: " + member.calculateBorrowLimit());
        System.out.println("Currently borrowed: " + member.getCurrentlyBorrowedCount());
    }


    private void displayBooks(Book book) {
        System.out.println("Book Id: " + book.getBookId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}


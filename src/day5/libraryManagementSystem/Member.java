package day5.libraryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public abstract class Member implements Borrowable{

    private final int memberId;
    private final String name;

    private final Set<Integer> borrowedBooks = new HashSet<>();

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }


    public abstract int calculateMembershipFee();


    public abstract int calculateBorrowLimit();


    public int getMemberId() {
        return memberId;
    }


    public String getName() {
        return name;
    }


    public int getCurrentlyBorrowedCount() {
        return borrowedBooks.size();
    }


    public Set<Integer> viewBorrowedBooks() {

        return Set.copyOf(this.borrowedBooks);

    }


    @Override
    public boolean canBorrow(Book book) {
        return book != null
                && book.getAvailableCopies() > 0
                && !borrowedBooks.contains(book.getBookId())
                && borrowedBooks.size() < calculateBorrowLimit();
    }

    @Override
    public boolean borrowBook(Book book) {

        if (!canBorrow(book)) {
            return false;
        }

        return borrowedBooks.add(book.getBookId());
    }

    @Override
    public boolean returnBook(Book book) {
        return book != null && borrowedBooks.remove(book.getBookId());
    }
}

package day5.libraryManagementSystem;

public class StudentMember extends Member{

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int calculateMembershipFee() {
        return 200;
    }


    @Override
    public int calculateBorrowLimit() {
        return 3;
    }
}

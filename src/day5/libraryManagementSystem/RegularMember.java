package day5.libraryManagementSystem;

public class RegularMember extends Member{

    public RegularMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int calculateMembershipFee() {
        return 300;
    }


    @Override
    public int calculateBorrowLimit() {
        return 5;
    }
}

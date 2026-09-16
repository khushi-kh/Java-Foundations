package day5.libraryManagementSystem;

public class PremiumMember extends Member{

    public PremiumMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int calculateMembershipFee() {
        return 500;
    }

    @Override
    public int calculateBorrowLimit() {
        return 10;
    }
}

package day5;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {

        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Initial Balance must be finite and non-negative.");
        }

        this.balance = balance;
    }

    private boolean isValidInput(double amount) {

        return amount >= 1 && Double.isFinite(amount);
    }

    public boolean deposit(double amount) {

        if (isValidInput(amount)) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {

        if (isValidInput(amount)) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return true;
            }
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {

        try{
            BankAccount ba = new BankAccount(2000);

            if (ba.deposit(3500)) {
                System.out.println(ba.getBalance());
            } else System.out.println("Invalid input");

            if (ba.deposit(Double.NaN)) {
                System.out.println(ba.getBalance());
            } else System.out.println("Invalid input");

            if (ba.withdraw(35000)) {
                System.out.println(ba.getBalance());
            } else System.out.println("Invalid input/Not sufficient balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }
}

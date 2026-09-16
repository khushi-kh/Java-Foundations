package day5.paymentSystem;

public class CashPayment extends Payment{

    @Override
    public void pay() {
        super.pay();
        System.out.println("Payment is done using cash.");
    }
}

package day5.paymentSystem;

public class CreditCardPayment extends Payment{

    @Override
    public void pay() {
        super.pay();
        System.out.println("Payment is done using Credit Card.");
    }
}

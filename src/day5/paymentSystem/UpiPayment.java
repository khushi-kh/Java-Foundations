package day5.paymentSystem;

public class UpiPayment extends Payment{

    @Override
    public void pay() {
        super.pay();
        System.out.println("Payment is done using UPI");
    }
}

package day5.paymentSystem2;

public class UpiPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Payment is processed using UPI.");
    }
}

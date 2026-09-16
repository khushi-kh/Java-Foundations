package day5.paymentSystem2;

public class CardPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Payment is processed using Card.");
    }
}

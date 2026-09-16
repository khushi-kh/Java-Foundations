package day5.paymentSystem2;

public class Main {

    public static void main(String[] args) {

        PaymentMethod upiPayment = new UpiPayment();
        PaymentMethod cardPayment = new CardPayment();

        upiPayment.pay();
        cardPayment.pay();
    }
}

package day5.paymentSystem;

public class Main {

    public static void main() {

        Payment[] paymentMethods = {
                new UpiPayment(),
                new CashPayment(),
                new CreditCardPayment()
        };

        for (Payment p : paymentMethods) {
            p.pay();
        }
    }
}

package day5.notificationSystem;

public class SmsNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Notification sent via SMS");
    }
}

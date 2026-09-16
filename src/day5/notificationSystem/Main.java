package day5.notificationSystem;

public class Main {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        email.send();
        sms.send();
    }
}

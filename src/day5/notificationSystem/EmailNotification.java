package day5.notificationSystem;

public class EmailNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Notification sent via Email");
    }
}

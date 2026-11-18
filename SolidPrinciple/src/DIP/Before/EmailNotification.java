package DIP.Before;

public class EmailNotification implements Notification{
    @Override
    public void notifyit() {
        System.out.println("email notification......");
    }
}

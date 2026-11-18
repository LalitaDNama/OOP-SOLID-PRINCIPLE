package DIP.After;

import DIP.Before.EmailNotification;

public class EmployeeD{
    private Notification notification;
    public EmployeeD(Notification notification){
        this.notification = notification;
    }
    public void notifyUser(){
        notification.notify();
    }
}

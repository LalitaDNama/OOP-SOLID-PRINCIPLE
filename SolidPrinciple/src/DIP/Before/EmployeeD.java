package DIP.Before;

public class EmployeeD {
    private EmailNotification emailNotification;

    public EmployeeD(EmailNotification emailNotification){
        this.emailNotification=emailNotification;
    }

    public void notifyUser(){
        emailNotification.notifyit();
    }
}

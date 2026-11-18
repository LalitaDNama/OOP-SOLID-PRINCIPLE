import DIP.After.Notification;
import DIP.Before.EmailNotification;
import DIP.Before.EmployeeD;
import ISP.After.Cube;
import ISP.After.Triangle2;
import ISP.Before.Triangle;
import LSP.After.Dog;
import LSP.Before.Eagle;
import LSP.Before.Ostrich;
import OCP.After.Square;
import OCP.Before.AreaCalculator;
import OCP.Before.Circle;
import OCP.Before.Shape;
import SRP.Employee;
import SRP.EmployeeSRP;
import SRP.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        //Single responsibility principle
        //Before
        /*In the above example, the Employee class has a few employee class-specific behaviors like getDesignation & updateSalary.
          Additionally, it also has another method named sendMail which deviates from the responsibility of the Employee class.
          This behavior is not specific to this class, and having it violates the single responsibility principle. To overcome this, you can move the sendMail method to a separate class.*/
        Employee employee = new Employee(1, "Retail", 10000);
        employee.getDepartment(1);
        employee.updateSalary(2000);
        employee.sendMail();

        //After
        EmployeeSRP employeeSRP = new EmployeeSRP(2, "Back", 2000);
        employeeSRP.getDepartment(2);
        employeeSRP.updateSalary(4200);
        NotificationService notificationService = new NotificationService();
        notificationService.sendMail();

        //Open closed principle
        //Before
        //The problem with the above example is that if there is a new instance of type Shape for which you need to calculate the area in the future, you have to modify the above class by adding another conditional else-if block. You will end up doing this for every new object of the Shape type.
        Shape shape = new Circle();
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.area(shape);

        //After
        Square square = new Square();
        square.area();

        //Liskov Substitution Principle
        //Before
        //In the above example, the Eagle class and the Ostrich class both extend the Bird class and override the fly() method. However, the Ostrich class is forced to provide a dummy implementation because it cannot fly, and therefore it does not behave the same way if we replace the Bird class object with it.
        Eagle eagle=new Eagle();
        eagle.fly();
        Ostrich ostrich=new Ostrich();
        ostrich.fly();

        //After
        Eagle eagle1=new Eagle();
        eagle1.fly();
        Dog dog=new Dog();
        dog.move();

        //Interface Segregation Principle
        //Before
        //The issue with this is that if a Square shape implements this, then it is forced to implement the calculateVolume() method, which it does not need.
        Triangle triangle=new Triangle();
        triangle.calculateArea();
        triangle.calculateVolume();

        //After
        Triangle2 triangle2=new Triangle2();
        triangle2.calculateArea();
        Cube cube=new Cube();
        cube.calculateVolume();

        //Dependency Inversion Principle
        //Before
        //In the given example, the Employee class depends directly on the EmailNotification class, which is a low-level module. This violates the dependency inversion principle.
        EmailNotification emailNotification=new EmailNotification();
        EmployeeD employeeD=new EmployeeD(emailNotification);
        employeeD.notifyUser();

        //After
        Notification notification=new DIP.After.EmailNotification();
        DIP.After.EmployeeD employeeD1=new DIP.After.EmployeeD(notification);
        employeeD1.notifyUser();


    }
}
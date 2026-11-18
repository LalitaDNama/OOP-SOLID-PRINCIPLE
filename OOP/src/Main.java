import Abstraction.Animal;
import Abstraction.Dog;
import Aggregation.Department;
import Aggregation.Professor;
import Association.BiDirectional.Author;
import Association.Unidirectional.Book;
import Composition.Computer;
import Composition.Processor;
import Encapsulation.BankAccount;
import Inheritance.Car;
import Inheritance.Vehicle;
import Polymorphism.MotorCycle;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        //Encapsulation
        //In this example, we encapsulate the accountNumber and balance attributes by making them private. We provide public methods deposit(), withdraw(), and getBalance() to interact with these attributes in a controlled manner.
        BankAccount bankAccount=new BankAccount("1234");
        double balance=bankAccount.getBalance("1234");
        System.out.println(balance);
        bankAccount.diposit(1000.00);
        System.out.println(bankAccount.getBalance("1234"));

        //Inheritance
        //In this example, we create a Vehicle class and a Car class that inherits from Vehicle. The Car class inherits the attributes and methods from Vehicle and can also define its own, like numberOfDoors. We also override the start() method in the Car class to provide a custom implementation.
        Vehicle car=new Car("india","mk4",new Date(),4);
        System.out.println(car.getMake());

        //Polymorphism
        //n this example, we create a Motorcycle class that also inherits from Vehicle. In the PolymorphismDemo class, we create instances of Car and Motorcycle and pass them to the startVehicle() method, which accepts a Vehicle parameter. This demonstrates polymorphism, as the startVehicle() method can work with any object that is a subclass of Vehicle.
        Vehicle motorcycle = new MotorCycle("Harley-Davidson", "Sportster", new Date(), false);
        startVehicle(car);
        startVehicle(motorcycle);

        //Abstraction
        //In this example, we create an abstract Animal class with an abstract method makeSound(). We also create a Swimmable interface with a swim() method. The Dog class extends Animal and provides an implementation for makeSound(). The Dolphin class extends Animal and implements the Swimmable interface, providing implementations for both makeSound() and swim() methods.
        Animal dog=new Dog("papi");
        dog.makeSound();

        //Association
        //In this example, a Book has an Author object, representing a unidirectional association relationship. The Book class has a reference to the Author class, indicating that a book has an author. However, the Author class does not have any reference to the Book class, so the relationship is one-way.
        Book book=new Book("Tomas","You can win");
        System.out.println(book.getName());

        //Now, the Author class has a list of Book objects, and the relationship between the Author and Book classes is bidirectional. Both classes have references to each other, allowing objects of one class to communicate with objects of the other class.
        Author author=new Author("James");
        author.addBooks(book);
        System.out.println(author);

        //Aggregation
        //In this example, a Department has a list of Professor objects, representing an aggregation relationship. The Department and Professor objects can exist independently of each other. If a Department is destroyed, the Professor objects can still exist and be associated with other departments.
        Department department=new Department("CSE");
        Professor professor=new Professor("CR");
        department.addProfessor(professor);
        System.out.println(department);

        //Composition
        Processor processor=new Processor("IC6");
        Computer computer=new Computer("HP","mk4");
        computer.setProcessor(processor);
        System.out.println(computer);
    }

    public static void startVehicle(Vehicle vehicle){
        vehicle.start();
    }
}
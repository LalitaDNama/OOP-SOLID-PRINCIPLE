package Inheritance;

import java.util.Date;

public class Car extends Vehicle{
    private int noOfDoors;

    public Car(String make, String model, Date year,int noOfDoors){
        super(make,model,year);
        this.noOfDoors=noOfDoors;
    }

    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfDoors=" + noOfDoors +
                '}';
    }
}

package Polymorphism;

import Inheritance.Vehicle;

import java.util.Date;

public class MotorCycle extends Vehicle {
    private Boolean hasSideCar;

    public MotorCycle(String make, String model, Date year,Boolean hasSideCar){
        super(make,model,year);
        this.hasSideCar=hasSideCar;
    }

    @Override
    public void start(){
        System.out.println("Motorcar is starting....");
    }
}

package Abstraction;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Click!");
    }
    @Override
    public void swim() {
        System.out.println("The dolphin is swimming...");
    }
}
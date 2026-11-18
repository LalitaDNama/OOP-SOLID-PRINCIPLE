package OCP.After;

import OCP.Before.Shape;

public class Square implements AreaCalculator {
    @Override
    public void area() {
        System.out.println("calculating area for square........");
    }
}

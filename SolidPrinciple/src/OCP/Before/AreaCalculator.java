package OCP.Before;

public class AreaCalculator {

    public void area(Shape shape){
        if(shape instanceof Square){
            System.out.println("calculating area for square......");
        }
        else if(shape instanceof Circle){
            System.out.println("calculating area for circle.......");
        }
    }
}

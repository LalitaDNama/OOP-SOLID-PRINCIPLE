package ISP.Before;

public class Triangle implements ShapeAreaCalculator{
    @Override
    public void calculateArea() {
        System.out.println("calculating area........");
    }

    @Override
    public void calculateVolume() throws Exception {
        throw new Exception("Invalid method....");
    }
}

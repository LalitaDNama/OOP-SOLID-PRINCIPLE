package LSP.Before;

public class Ostrich extends Bird{
    @Override
    public void fly() throws Exception {
        throw new Exception("Invalid Action...");
    }
}

package Username.src;

public class Const extends Node {
    private double value;

    public Const(double d) {
        value = d;
    }

    @Override
    public double eval() {
        return value;
    }
}

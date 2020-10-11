package figure;

public class Rectangle extends Potygon{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getField(){
        return a*b;
    }
}

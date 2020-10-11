package figure;

public class Triangle extends Figure{
    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    public double getField(){
        return (0.5*a*h);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(12,3);
        System.out.println(triangle.getField());
    }
}

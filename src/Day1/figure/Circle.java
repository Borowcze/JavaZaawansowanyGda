package Day1.figure;

public class Circle extends Figure {
    private double r;

    public Circle(double r){
        this.r = r;
    }


    public double getField(){
        return (Math.PI*Math.pow(r,2));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getField());
    }
}
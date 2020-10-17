package Day1.polimorfizm.figure;

public class Circle extends Figure {
    private double r;

    public Circle(double r){
        this.r = r;
    }


    public double getField(){
        return (Math.PI*Math.pow(r,2));
    }
}
package figure;

public class MainFigure {
    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure circle = new Circle(5);
        Figure triangle = new Triangle(12,6);
        Figure rectangle = new Rectangle(3,3);



        System.out.println("Circle field is: "+ circle.getField());
        System.out.println("Square field is: "+ square.getField());
        System.out.println("Triangle field is: "+ triangle.getField());
        System.out.println("Rectangle field is: "+ rectangle.getField());

    }
}

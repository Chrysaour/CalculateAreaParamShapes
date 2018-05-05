import Shapes.Shape;
import Shapes.Circle;
import Shapes.Triangle;
import Shapes.EquilatreralTriangle;
import Shapes.Trapezoid;
import Shapes.Rectangle;
import Shapes.Square;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 3.0);
        Shape triangle = new Triangle("Triangle", 3.0, 2.0, 1.5, 1.5);
        Shape equiateral_triangle = new EquilatreralTriangle("EquilatrealTriangle", 3.0, 1.5);
        Shape trapezoid = new Trapezoid("Trapezoid", 6.0, 3.0, 3.0, 3.2, 3.1);
        Shape rectangle = new Rectangle("Rectangle", 2.0, 3.0);
        Shape square = new Square("Square", 2.0);

        circle.showAreaAndPerimeter();
        triangle.showAreaAndPerimeter();
        equiateral_triangle.showAreaAndPerimeter();
        trapezoid.showAreaAndPerimeter();
        rectangle.showAreaAndPerimeter();
        square.showAreaAndPerimeter();
    }
}

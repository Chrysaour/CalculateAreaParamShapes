package Shapes;

public class Trapezoid extends Shape{

    private double short_width;
    private double long_width;
    private double height;
    private double side1;
    private double side2;

    public Trapezoid(String shapeName, double short_width, double long_width, double height, double side_1, double side_2) {
        super(shapeName);
        this.short_width = short_width;
        this.long_width = long_width;
        this.height = height;
        this.side1 = side_1;
        this.side2 = side_2;
    }

    @Override
    public double calculateArea() {
        return height*(short_width + long_width)/2;
    }

    @Override
    public double calculatePerimeter() {
        return short_width + long_width + side1 + side2;
    }
}

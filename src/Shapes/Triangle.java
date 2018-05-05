package Shapes;

public class Triangle extends Shape{

    private double width;
    private double height;
    private double side1;
    private double side2;

    public Triangle(String shapeName, double width, double height, double side1, double side2){
        super(shapeName);
        this.width = width;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(String shapeName, double width, double height){
        this(shapeName, width, height, width, width);
    }

    @Override
    public double calculateArea() {
        return height*width/2;
    }

    @Override
    public double calculatePerimeter() {
        return width + side1 + side2;
    }
}

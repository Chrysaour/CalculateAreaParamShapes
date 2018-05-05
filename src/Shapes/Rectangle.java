package Shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String shapeName, double width, double height){
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    // This is for Square which is extended from Rectangle
    public Rectangle(String shapeName, double height){
        this(shapeName, height, height);
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return width*2 + height*2;
    }
}

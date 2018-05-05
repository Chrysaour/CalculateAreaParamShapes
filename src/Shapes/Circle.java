package Shapes;

import java.lang.Math.*;

public class Circle extends Shape {
    private double radius;
    private double PI = Math.PI;

    public Circle(String shapeName, double r){
        super(shapeName);
        this.radius = r;
    }

    @Override
    public double calculateArea(){
        return Math.pow(radius, 2)*PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*PI;
    }
}

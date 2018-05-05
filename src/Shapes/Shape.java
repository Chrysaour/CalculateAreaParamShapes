package Shapes;

public abstract class Shape {
    private String shapeName;

    public Shape(String name){
        this.shapeName = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    private void showShapeName(){
        System.out.println("This is " + shapeName);
    }

    public void showAreaAndPerimeter(){
        showShapeName();
        System.out.println("Area: " + calculateArea() + " Perimeter: " + calculatePerimeter());
    }
}

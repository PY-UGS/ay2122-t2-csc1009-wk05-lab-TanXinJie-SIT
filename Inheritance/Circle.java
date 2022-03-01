package Inheritance;

public class Circle extends GeometricObject{
    private double radius;
    
    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
    public double getDiameter(){
        return 2 * this.radius;
    }
}

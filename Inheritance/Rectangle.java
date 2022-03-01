package Inheritance;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    
    public Rectangle() {
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(String color, Boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
}

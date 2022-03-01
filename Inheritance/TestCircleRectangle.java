package Inheritance;

public class TestCircleRectangle {
    public static void main(String[] args){
        Circle circ = new Circle(1);
        System.out.println("A circle " + circ.getProperties());
        System.out.println("The color is " + circ.getColor());
        System.out.println("The radius is " + circ.getRadius());
        System.out.println("The area is " + circ.getArea());
        System.out.println("The diameter is " + circ.getDiameter());
    
        Rectangle rect = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rect.getProperties());
        System.out.println("The area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());
    }
}

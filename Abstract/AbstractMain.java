package Abstract;

public class AbstractMain {
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Rectangle s = new Rectangle(6,6);
        Shape figref;
        
        figref = r;
        System.out.println(String.format("Inside Area for %s.", figref.getClass()));
        System.out.println(String.format("Area is %.1f", figref.getArea()));
        figref = t;
        System.out.println(String.format("Inside Area for %s.", figref.getClass()));
        System.out.println(String.format("Area is %.1f", figref.getArea()));
        figref = c;
        System.out.println(String.format("Inside Area for %s.", figref.getClass()));
        System.out.println(String.format("Area is %.1f", figref.getArea()));
        figref = e;
        System.out.println(String.format("Inside Area for %s.", figref.getClass()));
        System.out.println(String.format("Area is %.1f", figref.getArea()));
        figref = s;
        System.out.println("Inside Area for class Abstract.Square.");
        System.out.println(String.format("Area is %.1f", figref.getArea()));
    }
}

class Rectangle extends Shape{
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    public double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double getArea() {
        return (dim1 * dim2) / 2;
    }
}

class Circle extends Shape{
    public Circle(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    public double getArea() {
        return this.PI * dim1 * dim1;
    }
}

class Ellipse extends Shape{
    public Ellipse(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    public double getArea() {
        return this.PI * dim1 * dim2;
    }
}

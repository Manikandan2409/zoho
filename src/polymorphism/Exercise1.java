package polymorphism;

/*
 * Create a class called "Shape" with a method called "draw" that prints out "Drawing a shape".
 * Create subclasses such as "Rectangle" and "Circle" that override the draw method to print out "Drawing a rectangle" and "Drawing a circle" respectively.
 */
class Shape {
    protected void draw(){System.out.println("Drawing a shape");}
}
/**
 *  Rectangle
 */
class Rectangle extends Shape {
@Override
protected void draw() {
    System.out.println("Drawing Rectangle");
}
}
/**
 * Circle
 */
class Circle extends Shape {
    @Override
    protected void draw() {
        System.out.println("Drawing Circle");
    }
    public void helo(){System.out.println("Hello");}
    
}

/**
 * Exercise1
 */
public class Exercise1 {
public static void main(String[] args) {
    Shape shape = new Shape();
    shape.draw();
    Rectangle rectangle = new Rectangle();
    rectangle.draw();
    
    Shape shape2 = new Rectangle();
    shape2.draw();
    Shape shape3 = new Circle();
    shape3.draw();;
}
}

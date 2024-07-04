package Inheritance;
/*
 *  Create a class called "Shape" with properties such as "numSides" and "area".
 *  Create a subclass called "Rectangle" that inherits from the Shape class and adds properties such as "length" and "width".
 */

import java.util.Scanner;

/**
 * Shape
 */

class Shape {
    private int numSides;
    private int area;
    public int getNumSides() {
        return numSides;
    }
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Number of sides: "+getNumSides() +", area: "+getArea();
    }
}

/**
 * Rectangle
 */
class Rectangle extends Shape{
    private int length;
    private int width;
     
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

     public int area(){
          setArea( width * length);
          return super.getArea();
    }
    public int perimeter(){
        return  (2 * ( width + length));
      }
    public double diagonal(){
        return  Math.sqrt( (width * width) + (length * length) );
    }
    
}
public class Exercise3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);
       System.out.println("Enter width and height of the rectangle ");
        rectangle.setWidth(in.nextInt());
        rectangle.setLength(in.nextInt());
        System.out.println("Perimeter of the rectangle :"+ rectangle.perimeter());
        System.out.println("Area of the rectangle :"+ rectangle.area());
        System.out.println("Diagonal size of the rectangle :"+ rectangle.diagonal());

        in.close();
    }
}

package Classes_Objects;

import java.util.Scanner;

/**
 * Rect
 */
/*
 * •	Create a class called "Rectangle" with properties such as "length" and "width". 
 * Implement methods such as "getArea" and "getPerimeter" that calculate and return the area and perimeter of the rectangle.
 */
class Rect {
    private int width;
    private int length;
    Rect(){

    }
    Rect(int width, int height){
        setLength(height);
        setWidth(width);
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getPerimeter(){
        return 2 * (getLength() + getWidth());
    }
    public int getArea(){
        return getLength() * getWidth();
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width of the rectangle ??");
        int width = in.nextInt();
       
        System.out.println("Enter height of the rectangle");
        int height = in.nextInt();

        Rect rectangle = new Rect(width,height);
        System.out.println("Perimeter of the rectangle is "+ rectangle.getPerimeter()+ " and area of rectangle is "+ rectangle.getArea());

        in.close();
    }   
}

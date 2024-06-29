package Inheritance;

import java.util.Scanner;

/*
 * 
 * 	Create a class called "Animal" with properties such as "name", "age", and "species".
 *  Create a subclass called "Cat" that inherits from the Animal class and adds properties such as "color" and "numLives".
 */
/**
 * Animal
 */
class Animal {
    private String name;
    private int age;
    private String species;

    protected String getName() {
        return name;
    }
    protected int getAge() {
        return age;
    }
    protected String getSpecies() {
        return species;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setAge(int age) {
        this.age = age;
    }
    protected void setSpecies(String species) {
        this.species = species;
    }
    @Override
    public String toString() {
        return " Name -"+ name+ " age is "+ age + "species "+ species;
    }
}
/**
 * Cat
 */
class Cat  extends Animal{
    private String color;
    private int numLives;
    protected String getColor() {
        return color;
    }
    protected void setColor(String color) {
        this.color = color;
    }
    protected int getNumLives() {
        return numLives;
    }
    protected void setNumLives(int numLives) {
        this.numLives = numLives;
    }
    
    public String toString() {
        return super.toString() + " color -"+ color + " number of lives "+ numLives;
    }
}
 public class Exercise5 {
   public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner in = new Scanner(System.in);
        cat.setName(in.nextLine());
        System.out.println("Enter the Age :");
        cat.setAge(in.nextInt());
        System.out.println("Enter the species :");
        cat.setSpecies(in.nextLine());

        System.out.println("Enter the color of the cat :");
        cat.setColor(in.nextLine());

        System.out.println("Enter the number of lives the cat have :");
        cat.setNumLives(in.nextInt());
        System.out.println("Cat Details : \n "+ cat.toString());
        in.close();
    } 
}

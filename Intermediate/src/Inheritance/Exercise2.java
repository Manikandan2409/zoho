package Inheritance;
/*
 * •	Create a class called "Vehicle" with properties such as "make", "model", and "LocalDate".
 *      Create a subclass called "Car" that inherits from the Vehicle class and adds properties such as "color" and "numDoors".
 */
/**
 * Vehicle
 */

import java.time.LocalDate;

class Vehicle {
private String make;
private String model;
private LocalDate LocalDate;
Vehicle(){}
Vehicle(String make,String model, LocalDate LocalDate){

    this.make = make;
    this.model = model;
    this.LocalDate = LocalDate;
}
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public LocalDate getLocalDate() {
        return LocalDate;
    }
    public void setLocalDate(LocalDate LocalDate) {
        this.LocalDate = LocalDate;
    }
    @Override
    public String toString() {
        return "Make :"+getMake() + ", model : "+getModel()+ ", year: "+ getLocalDate().getYear();
    }
    
}
/**
 * Car
 */
class Car extends Vehicle {

    private String color;
    private int numDoors;

    Car(){super();}
    Car(String make, String model, LocalDate LocalDate,String color,int numDoors){
        super(make, model, LocalDate);
        this.color=color;
        this.numDoors = numDoors;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    @Override
    public String toString() {
        return super.toString() +", color: "+getColor() +", num of doors:- "+getNumDoors();
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("India");
        vehicle.setModel("A3");
        vehicle.setLocalDate(LocalDate.of(2010, 10, 30));
        System.out.println(vehicle.toString());

        Car car = new Car("China", "Land Rover", LocalDate.of(2017, 10, 20), "white", 4);
        System.out.println(car.toString());

    }
    
}

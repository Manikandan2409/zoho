package Inheritance;
/**
 * Animal
 */
/*
 * •	Create a class called "Animal" with properties such as "name", "age", and "species". 
 *      Create a subclass called "Dog" that inherits from the Animal class and adds properties such as "breed" and "color".
 */
class Animal {
    private String name;
    private int age;
    private String species;
    Animal(){}
    Animal(String name, int age, String species){
        this.setName(name);
        this.setAge(age);
        this.setSpecies(species);
    }
    protected int getAge() {
        return age;
    }
    protected String getName() {
        return name;
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
    public String toString() {
        return "Name : "+ getName()+" species: "+getSpecies();
    }
}
/**
 * Dog
 */
class Dog extends Animal {
    private String breed;
    private String color;
    Dog(){}
    Dog(String name, int age, String species,String breed, String color){
        super(name,age,species);
        setBreed(breed);
        setColor(color);    
    }
    public String getBreed() {
        return breed;
    }
    private void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    private void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Name : "+ getName()+" species: "+getSpecies()+" age:-"+ getAge()+" Breed :"+getBreed()+ " color: "+getColor();
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 23, "Carnivorse");
        System.out.println( animal.toString() );

        Dog dog = new Dog("Tiger", 4, "Omnivorse", "Pommeriyan", "sandal");

       System.out.println( dog.toString() );

        Animal animal2= new Dog("Carla", 10, "Omnivorse", "puppy", "White");

        System.out.println(animal2.toString());
    }
}

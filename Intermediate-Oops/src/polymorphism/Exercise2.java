
package polymorphism;
/**
 *•	Create a class called "Animal" with a method called "speak" that prints out a message such as "The animal says roar".
 Create subclasses such as "Dog" and "Cat" that override the speak method to print out "The dog says woof" and "The cat says meow" respectively. 
 */

class Animal {
 protected void speak(){System.out.println("The animal says roar!");}   
}
/**
 * Dog
 */
class Dog extends Animal{
    @Override
    protected void speak() {
        System.out.println("The dog says woof!!");
    }
}
/**
 * Cat 
 */
class Cat extends Animal {
    @Override
    protected void speak() {
        System.out.println("the cat  says meow!!");
    }

   
}
public class Exercise2 {    
public static void main(String[] args) {
    
    Animal animal = new Animal();
    animal.speak();
    
    Dog dog = new Dog();
    dog.speak();
    
    new Cat().speak();
}    
}

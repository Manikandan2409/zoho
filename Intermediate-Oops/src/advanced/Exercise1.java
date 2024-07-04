package advanced;
/*
 * •	Implement an abstract class in Java with at least one abstract method. Create a concrete class that extends the abstract class 
 * and implement the abstract method. Instantiate the concrete class and invoke its method.
 */
abstract class  Animal {
    private String name;
    protected int speed;
    Animal(){
        name=null;
        speed =0;
    }
    Animal(String name){
        this.name = name;
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    abstract int getSpeed();
    protected  abstract void setSpeed(int speed);
   
    public String toString() {
      return "Animal Name :"+ name;
    }
}
/**
 * Horse extends
 */
class Horse extends  Animal{
    
    Horse(){
        super();
    }
    Horse(String name){
        super(name);
    }
    Horse(String name,int speed){
        super(name);
        this.speed = speed;

    }
    protected void setSpeed(int speed) {
        this.speed= speed;        
    }
    int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return super.getName()+ " Speed:"+ speed;
    }
}
/**
 * Pig
 */
class Pig extends Animal{
   
   Pig(){

   }
   Pig(String name){
    super(name);
   }
   Pig(String name,int speed){
        super(name);
        this.speed = speed;
   }
    protected void setSpeed(int speed) {
        this.speed= speed;        
    }
    int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return super.toString()+" Speed:"+ speed;
    }
    
}
public class Exercise1 {
    public static void main(String[] args) {
        Horse joe = new Horse();
        joe.setName("Joe");
        joe.setSpeed(70);
        System.out.println("Horse class values "+ joe.toString());

        Pig dump = new Pig("Dump", 20);
        System.out.println("Pig class values :"+ dump.toString());

        Animal ani = new Horse();
        ani.setName("Zebra");
        ani.setSpeed(60);
        System.out.println("Base class reference pointing derived class object :"+ ani.toString());

        Animal lion = new Animal() {
            @Override
            protected void setSpeed(int speed) {
           this.speed = speed;
            }
            @Override
            int getSpeed() {
                return this.speed;
            }
            @Override
            public String toString() {
                return super.toString() +" Speed :"+speed;
            }

        };
    lion.setName("Leo");
    lion.setSpeed(120);
    System.out.println("Creating anonymous class for the abstract methods :"+ lion.toString());
    }
}

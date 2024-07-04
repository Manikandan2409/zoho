package MediumLevel;
/*
 * Write a Java program that demonstrates the use of inheritance by creating a parent class and a child class that inherits from it.
 * Instantiate objects of both classes and invoke their methods
 */

 /**
  * Base
  */
class Base {
    private int age ;
    Base(){}
    Base(int age){this.age = age;}
    protected int getAge() {
        return age;
    }
    protected void setAge(int age) {
       System.out.println("Base.setAge()");
        this.age = age;
    }
    @Override
    public String toString() {
        return "Age :"+ age;
    }
 }
 /**
  * Derived
   */
class Derived  extends Base{
  private  String name;
  Derived(){}
  Derived(String name){this.name=name;}
  Derived(String name,int age){
     super(age);
    }
    @Override
    protected void setAge(int age) {
        super.setAge(age);
        System.out.println("Derived.setAge()");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return super.toString() +" "+ name;
    }
    
 }
public class Exercise1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setAge(10);
        System.out.println("Base class object   with their reference  and overriding the toString():"+ b);

        Derived d = new Derived();
        
        d.setName("Comrade");
        d.setAge(50);
        System.out.println("Exercise1.main()" + " calling dervied class object with their reference  and overriding toString():"+ d);
        Base bd = new Derived("THomas Shelby");
        bd.setAge(50);

        System.out.println("Exercise1.main() base class reference with derived class object ^riding toString() :"+ bd);

    }
}

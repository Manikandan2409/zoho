
/*13) Implement a generic class in Java that stores a collection of elements of any type.
Use the class to store strings, integers, and custom objects. Demonstrate the use of wildcard and bounded type parameters. */

import java.util.ArrayList;


class Generic<T>{

    private ArrayList<T> item = new ArrayList<>();

    public void addItem(T item){
        this.item.add(item);
    }
    public T getItem(int index){
        return item.get(index);
    }
    public void display(){
        System.out.println(this.getClass());
        for (T t : item) {
            System.out.print(t+" ");
        }
    }
}

class Student{
    private int id;
    private String name;
    
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: "+ this.id+" Name: "+ this.name;
    }


}

public class Exercise13 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        Generic<Integer> integerBox = new Generic();

        integerBox.addItem(40);
        integerBox.addItem(50);
        integerBox.addItem(90);
        integerBox.display();
        System.out.println();

        Generic<String> stringBox = new Generic();
        stringBox.addItem("HI Hello");
        stringBox.addItem("Comrade Hello");
        stringBox.display();
        System.out.println();

        Generic<Student> student = new Generic();
        student.addItem(new Student(10, "Manikandan"));
        student.addItem(new Student(11, "Mathavan"));
        student.display();
    }    
}

package Classes_Objects;

import java.util.Scanner;

/**
 * StudentBase
 */
/*
 * •Create a class called "Student" with properties such as "name", "age", and "grade".
 *  Implement the necessary getter and setter methods for each property
 */
class StudentBase {
    private String name;
    private int age;
    private String grade;

    StudentBase(String name, int age,String grade){
        setName(name);
        setAge(age);
        setGrade(grade);
    }
    StudentBase(){}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return  " Name: "+ getName() +" Age :"+getAge()+" Grade :"+ getGrade();
    }

}
public class Exercise1 {
    public static void main(String[] args) {
        StudentBase studentBase = new StudentBase();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Student Name: ");
        String name = in.next();

        System.out.println("Enter age of the student :");
        int age = in.nextInt();
       
        System.out.println("Enter the grade where the student is Studying? ");
        in.next();
        String grade = in.nextLine();

        studentBase.setName(name);
        studentBase.setAge(age);
        studentBase.setGrade(grade);
        System.out.println("1 Student created Successfully!!");

        System.out.println("Creating a new Student object With same values by passing parameters while creating an object ");
        System.out.println("Enter a Student Name: ");
        in.next();
        name = in.nextLine();

        System.out.println("Enter age of the student :");
        age = in.nextInt();

        System.out.println("Enter the grade where the student is Studying? ");
        grade = in.next();

        
        StudentBase studentBase2 = new StudentBase(name, age, grade);
        if (studentBase2 != null) {
            System.out.println("Student object created successfully!!!");
        }
        System.out.println("Student 1 detail :"+ studentBase.toString());
        System.out.println("Student 2 detail :"+ studentBase2.toString());

        in.close();
    }   
}

package Inheritance;

import java.util.Scanner;

/*
 * Create a class called "Person" with properties such as "name", "age", and "address".
 * Create a subclass called "Student" that inherits from the Person class and adds properties such as "grade" and "school".
 */
/**
 * Person
 */
class Person {
    private String name;
    private int age;
    private String address;

    protected String getAddress() {
        return address;
    }
    protected void setAddress(String address) {
        this.address = address;
    }
    protected int getAge() {
        return age;
    }
    protected void setAge(int age) {
        this.age = age;
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person name :"+ name + " age is "+ age + " lives in "+ address;
    }
}
 /**
  * Student
  */
class Student  extends Person{
     private String grade;
     private String school;
      protected void setGrade(String grade) {
          this.grade = grade;
      }
      protected String getGrade() {
          return grade;
      }
      protected String getSchool() {
          return school;
      }
      protected void setSchool(String school) {
          this.school = school;
      }
      @Override
      public String toString() {
          return "Student Name :"+ getName() + "Age :"+ getAge() + " lives in "+ getAddress() +" studies in  "+ school + " have grade "+ grade;
      }
    
 }
 public class Exercise4 {
    public static void main(String[] args) {
        // Student Details :-
        Student student = new Student();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Sutdent Name :");
        student.setName(in.nextLine());
        System.out.println("Enter the Student age :");
        student.setAge(in.nextInt());
        in.nextLine();
        System.out.println("Enter the Student Address :");
        student.setAddress(in.nextLine());
        System.out.println("Enter the Student School Name :");
        student.setSchool(in.nextLine());
        System.out.println("Enter the Student grade :");
        student.setGrade(in.nextLine());
        System.out.println("Student Details : \n"+ student.toString());

        // Father Details :-

        Person father = new Person();
        System.out.println("Enter the father\'s name :");
        father.setName(in.nextLine());
        System.out.println("Enter father\'s age :");
        father.setAge(in.nextInt());
        in.nextLine();
        System.out.println("Enter the father\'s Address ");
        father.setAddress(in.nextLine());
        System.out.println("Fathers Person details : \n" + father.toString());

        in.close();
    }
}

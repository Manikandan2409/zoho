package Classes_Objects;

import java.time.LocalDate;

import java.util.Scanner;


/**
 * Emp
 */
/*
 *  Create a class called "Employee" with properties such as "name", "salary", and "hireDate". 
 *  Implement the necessary getter and setter methods for each property.
 */
class Emp {
    private String name;
    private int salary;
    private LocalDate hireDate;
    
    Emp(){
        this.setName(null);
        this.setSalary(0);
        this.setHireDate(null);
    }
    
    Emp(String name, int salary, LocalDate localDate)
    {
        this.setName(name);
        this.setSalary(salary);
        this.setHireDate(localDate);

    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setSalary(int salary) {
        this.salary = salary;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
   @Override
   public String toString() {
       return " Name: "+ this.getName()+" Salary :"+ this.getSalary() + " Hiring Date :"+ this.getHireDate();
   }
    
}
public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = in.nextLine();
        
        System.out.println("Enter Salary Amount :");
        int salary = in.nextInt();

        System.out.println("Enter the year of Joining(YYYY-MM-DD) :");
        in.nextLine();
        String d = in.nextLine();
        LocalDate date = LocalDate.parse(d);
        Emp employee = new Emp(name, salary, date);
        System.out.println(employee.toString());
        
        
        in.close();
    }
}

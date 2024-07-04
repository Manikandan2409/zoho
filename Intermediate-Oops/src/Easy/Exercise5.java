package Easy;

import java.util.Scanner;

/**
 * Factorial
 */
class Factorial {
    public int factorial(int num){
        if (num<= 1) {
            return num;
        }else{
            return num * factorial(num -1);
        }
    }
    
}
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("program to calculate the factorial :");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to get the factorial :");
        int num = in.nextInt();
        Factorial f = new Factorial();
        System.out.println("Factorial of "+ num + " is "+f.factorial(num));
        in.close();
    }
}

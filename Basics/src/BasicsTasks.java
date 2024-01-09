import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import basics.Help;

/**
 * BasicsTasks
 */
public class BasicsTasks {

    //1.1 Printing Hello World
    void helloWorld(){
        System.out.println("Hello World");
    }
    //1.2 Greet User
    void greetUser()
    {
        Help.begin();
        System.out.println("Greeting User  by name");
        Help.printLine();
        String name=Help.in.nextLine();
        System.out.println("Hey, Hi Welcome "+ name+", Its pleasure to meet you");
    }
    //1.3 Comparing 2 numbers 
    void comparingNumbers(){
        Help.begin();
        System.out.println("Comparing two Numbers");
        Help.printLine();
        System.out.println("Enter number1");
        int num1=Help.in.nextInt();
        System.out.println("Enter number 2: ");
        int num2=Help.in.nextInt();
        Help.printLine();
        if (num1<num2) {
            System.out.println(num1 +" is less than "+num2+","+num2+" is greater than "+ num1);
        } else  if (num1>num2) {
            System.out.println(num1 +"is grater than "+num2+","+num2+" is less than "+ num1);
            
        }else{
            System.out.println(num1 +" is equal to "+ num2);
        }
        Help.end();
    
    }
    //1.4  program that asks the user to enter a number and then prints out whether the number is positive, negative, or zero.
    void positiveOrNegative()
    {
        Help.begin();
        System.out.println("program to check  whether the number is positive negative or zero");
        Help.printLine();
        System.out.println("Enter a number to check:");
        int num=Help.in.nextInt();
        String result = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        Help.printLine();
        System.out.println(" The given number "+ num + " is "+result);
        Help.end();
    }
    //1.5  program that asks the user to enter their age. If the user is 18 or older, print out "You are an adult."
    // Otherwise, print out "You are not yet an adult.
    void CheckAdultOrNot()
    {
        Help.begin();
        System.out.println(" Program to check Adult or Not");
        Help.printLine();
        System.out.println("Enter your age : ");
        int age=Help.in.nextInt();
        String result=(age < 0)? " Age can\'t be less than Zero":(age<18) ? "You\' not an adult ":" You\'re adult!";
        Help.printLine();
        System.out.println(result);
        Help.end(); 
    }
    //1.6  program that asks the user to enter a temperature in Celsius and converts it to Fahrenheit.
    // The formula for converting Celsius to Fahrenheit is F = (C * 9/5) + 32.

    void celsiusToFahrenheit()
    {
        Help.begin();
        System.out.println("Program to calculate Celsius to Fahrenheit");
        Help.printLine();
        System.out.println("Enter Celsius to calculate Fahrenheit:");
        double Celsius = Help.in.nextDouble();
        double fahrenheit = (Celsius * 9/5) + 32;
        Help.printLine();
        System.out.println("Farenheit of " +Celsius+ " degree celsius is : "+ fahrenheit);
        Help.end();
    }
    //1.7 program that generates a random number between 1 and 10 and asks the user to guess the number. 
    //Provide feedback to the user if their guess is too high or too low, and 
    //keep track of how many guesses it takes them to get the correct answer.
    void rand1To10(){
          Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; 
        int noOfGuesses = 0;
        boolean guessCorrectly = false;
        System.out.println("Guessing the number betweeen 1-10");
        Help.printLine();
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (!guessCorrectly) {
            System.out.print("Guess the number (between 1 and 10): ");
            int userGuess =(int) Help.in.nextDouble();
            noOfGuesses++;
            Help.printLine();
            if (userGuess == secretNumber) {
                guessCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number " +secretNumber+ " in "  + noOfGuesses + " guesses.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        Help.end();
    }

    
    //1.8  a program that asks the user to enter a number between 1 and 100. If the number is between 1 and 50,
    // print out "The number is in the lower half." If the number is between 51 and 100, print out 
    //"The number is in the upper half." If the number is outside the range of 1 to 100, print out "Invalid number."
    void rand1To100(){
        Help.begin();
        System.out.println(" Checking the number is inside the range ( 1 to 100)");
        Help.printLine();
        int num=Help.in.nextInt();
        if (num<0 || num>100) {
            System.out.println("Invalid number");
        }
        else if (num < 50) {
            System.out.println("The number is in the lower half");
        } else {
            System.out.println("The number is in the upper half");
        }           
    }
    //1.9 a program that asks the user to enter a string and then checks whether the string contains the word "Java".
    // If it does, print out "The string contains Java." If it doesn't, print out "The string does not contain Java."
    void containsJava(){
    Help.begin();
        System.out.println("Check whether the String value  have  keyword java");
        Help.printLine();
        System.out.println("Enter a sentence");
        String sen=Help.in.nextLine();
        if(sen.toLowerCase().contains("java"))
        {
            System.out.println("The given String contains java!");
        }
        else{
            System.out.println("The given String doesn\'t  contain java.");
        }
        Help.end();
    }
    //1.10     program that calculates the sum of two numbers and prints the result.
    void twoSum()
    {
        Help.begin();
        System.out.println("Sum of Two NUmbers");
        System.out.println("Enter 1st number");
        int num1 =Help.in.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = Help.in.nextInt();
        System.out.println("Sum  of " + num1+ " and " + num2+ " is "+(num1+num2));
        Help.end();
    }
    // 1.11 Create a program that generates a random number between 1 and 100 and asks the user to guess the number.
    // Provide feedback to the user if their guess is too high or too low, and keep track of how many guesses it takes them to get the correct answer.

    void rand1To100ByGuess(){
        Help.begin();
        System.out.println("Guess the number between (1- 100)");
        Help.printLine();
        Random random=new Random();
        int GuessedNum= random.nextInt(100)+1;
        System.out.println("Guessed value:" +GuessedNum);
        int noOfGuesses=0;
        boolean guessedCorrectly=false;
        while (!guessedCorrectly) {
           System.out.println("Enter a number between (1-100)");
            int guessing=(int) Help.in.nextDouble();
            
            if (guessing < 0 ||guessing >100 ) {
                System.out.println("You entered out of the bound. Enter values between (1 - 100)");
                continue;
            }else
                if ( guessing < GuessedNum) {System.out.println(" you guess is  low!");}
                else if (guessing > GuessedNum){System.out.println("you guess is  high!");}
                else{
                    System.out.println("Congrats you found the correct guessed Number!!!");
                    Help.printLine();
                break;
        }
        int dif=Math.abs(GuessedNum - guessing);
        int range= dif/10;
        switch (range) {
            case 0:
                System.out.println("You are very close to the number!");
                break;
            case 1:
                System.out.println("You are within 10 of the correct number.");
                break;
            case 2:
                System.out.println("You are within 20 of the correct number.");
                break;
            default:
                System.out.println("You are quite far from the correct number.");
        }
            Help.printLine();
    }
    Help.end();

    }
    //1.12  program that takes a string as input and reverses the order of the characters in the string.
    void reverseInputString(){
        Help.begin();
        System.out.println("Program to reverse a given string without using any built-in function");
        Help.printLine();
        System.out.println("Enter a String value you like to reverse ");
        String str=Help.in.nextLine();
        StringBuilder sb= new StringBuilder(str);
        int len=sb.length();
        int end=len-1;
        for (int i = 0; i < len / 2; i++, end--) {
            char c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(end));
            sb.setCharAt(end, c);
        }
        System.out.println(sb.toString());
        Help.end();
    }
    // 1.13  a program that reads in a list of numbers from the user and then calculates the average of those numbers.
     void averageOfNumbers(){
        Help.begin();
        System.out.println("Program to find the Average of given  programs");
        Help.printLine();
        System.out.println("Enter of many numbers you like to enter");
        int len = (int) Help.in.nextDouble();
        double[] arr= new double[len];
        Help.setArray(arr);
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];    
        }
        double average=sum/len;
        Help.printLine();
        System.out.println("Average of the given list of numbers is :"+ average);
        Help.end();

     }
     // 1.14 Implement a program that determines whether a given string is a palindrome (i.e., it reads the same forwards and backwards).
     void palindrome(){
        Help.begin();
        System.out.println("Program to find the String is palindorme or not");
        Help.printLine();
        System.out.println("Enter a String to find it\'s palindrome or not :");
        String str=Help.in.nextLine();
        StringBuilder sb=new StringBuilder();
      
      if (Help.isPalindrome(str)) {
        System.out.println("The given String is palindrome");
      }else{
        System.out.println("The given String "+ str+" is  not palindrome");
      }
      Help.end();
     }
      // 1.15 Write a program that finds the largest and smallest numbers in an array of integers
      void largestAndSmallest(){
        Help.begin();
        System.out.println("Program to find the largest ELement in an array");
        Help.printLine();
        System.out.println("Enter the Length of an array");
        int len=Help.in.nextInt();
        int[] arr=new int[len];
        Help.setArray(arr);
        Help.selectionSort(arr);
        System.out.println("Smallest element in an array :"+ arr[0]);
        System.out.println(" Largest element in an array "+arr[arr.length-1]);
        Help.end();
      }
      // 1.16 program that reads in a list of names from the user and then sorts them in alphabetical order.
      void sortName(){
        Help.begin();
        System.out.println("Program to reads list of name and sort in alphabetical order");
        Help.printLine();
        ArrayList<String> nameList = new ArrayList<>();
        while (true) {
            System.out.println("Enter a name or (press enter to  finish :)");
            String name = Help.in.nextLine();
            if (name.isEmpty()) {
                break;
            }
            nameList.add(name);
        }
        Collections.sort(nameList);
        System.out.println("Sorted Namelist :");
        for (String name : nameList) {
            System.out.println(name);
        }
      }

      // 1.17 a program that generates a multiplication table for a given number.
      void multiplicationTable(){
        Help.begin();
        System.out.println("Program to print the Mulitplication Table");
        Help.printLine();
        System.out.println("Enter which number of table you like to print :");
        double nthTbl=Help.in.nextDouble();
        Help.printLine();
        System.out.println("Enter how many rows you like to print :");
        int rows= (int) Help.in.nextDouble();
        Help.printLine();
        for (int i = 1; i <= rows ; i++) {
            System.out.println((i) +" * "+ nthTbl +" = "+(i*nthTbl));
        } 
        Help.end();
      }
      
}

import java.util.ArrayList;
import java.util.List;

import basics.Help;
public class LoopsAndRecursion {
    public static void main(String[] args) {
        new LoopsAndRecursion().possibleSubSets();
    }
    // 7.1  program to find all possible permutations of a given string using recursion.
    void permutation(){
          Help.begin();
        System.out.println("Program to find the permutation of a String"); 
        Help.printLine();
        System.out.println("Enter a string to permutate : -");
		String str = Help.in.nextLine(); 
		int n = str.length(); 
		permute(str, 0, n-1); 
        Help.end();
    }

    // 7.2 program to find the Fibonacci sequence up to a given limit using looping.
     void fibonacciSeries(){
        new Exercise().nFibonocii();
     } 
    private  void permute(String str, int l, int r) 
	{ 
		if (l == r) 
			System.out.println(str); 
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r); 
				str = swap(str,l,i); 
			} 
		} 
	} 
    // 7.3 program to check if a given number is a prime number using recursion.
    void primeRecursion(){
        Help.begin();
        System.out.println("Finding the number is prime using recursion");
        Help.printLine();
        System.out.println("Enter a number to check is prime or not");
        int n = Help.in.nextInt();   
        if (isPrime(n, 2))      System.out.println(n+" is a prime number.");
        else    System.out.println("not a prime number");
}   
    // 7. 4  program to calculate the factorial of a given number using recursion.
    void findFactorial(){
        Help.begin();
        System.out.println(" program to calculate the factorial of a given number using recursion.");
        Help.printLine();
        System.out.println("Enter a number to find the factorial : -");
        int n = Help.in.nextInt();
        Help.printLine();
        System.out.println("Factorial of "+ n +"  is "+ factorial(n));
        Help.end();
    }
    // 7.5 program to generate all possible subsets of a given set using recursion.
    void possibleSubSets(){


        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);

        List<Integer> subset = new ArrayList<>();
        generateSubsets(set, subset, 0);
    }

    // 7.6 a program to generate the first n prime numbers using looping.
    void nPrimeNumbers(){
        Help.begin();
        System.out.println("a program to generate the first n prime numbers using looping.");
        Help.printLine();
        System.out.println("Enter n th number to print the prime Number : -");
        int nthPrime = Help.in.nextInt();
        generatePrimes(nthPrime);
    }
     void generatePrimes(int n) {
        int count = 0;
        int number = 2;

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    void generateSubsets(List<Integer> set, List<Integer> subset, int index) {
        printSubset(subset);
        for (int i = index; i < set.size(); i++) {
            subset.add(set.get(i));
            generateSubsets(set, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
     void printSubset(List<Integer> subset) {
        System.out.print("{ ");
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println("}");
    }
     boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int factorial(int n)
 {
    Help.begin();
    if (n<=1) {
        return 1;
    }else{
        return n * factorial(n - 1);
    }
 }


 public static boolean isPrime(int num, int divisor){
    if (num<= 1) { return false;}
    if (divisor > Math.sqrt(num)) { return true;}
    if (num % divisor == 0) {return false;}
        return isPrime(num, divisor + 1);
    }
	public  static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
}

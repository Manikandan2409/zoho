import basics.Help;

public class ArrayManipulation {
    public static void main(String[] args) {
        new ArrayManipulation().reverseString();
    }
    //3.1 a program to find the sum of all the elements in an array of integers.
    void sumOfAllElements(){
         Help.begin();
        System.out.println("Sum of elements in an array");
        Help.begin();
        System.out.println("Enter the length of an array");
        int len=Help.in.nextInt();
        int[] arr= new int[len];
        int sum=0;
        for (int i = 0; i < len; i++) {
            arr[i]=Help.in.nextInt();
            sum+=arr[i];
        }
        Help.printLine();
        System.out.println("Sum of array: "+ sum);
        Help.end();
    }
    // 3.2 a program to find the largest element in an array of integers.
    void largestElement(){
        Help.begin();
        System.out.println("Program to find the largest ELement in an array");
        Help.printLine();
        System.out.println("Enter the Length of an array");
        int len=Help.in.nextInt();
        int[] arr=new int[len];
        Help.setArray(arr);
        Help.selectionSort(arr);
        Help.printLine();
        System.out.println(" Largest element in an array "+arr[arr.length-1]);
        Help.end();
    }
    // 3.3   a program to find the average of all the elements in an array of doubles.
        void averageDouble(){
            Help.begin();
            System.out.println("Program to find the Average of given double programs");
            Help.printLine();
            System.out.println("Enter of many numbers you like to enter");
            int len = (int) Help.in.nextDouble();
            double[] arr= new double[len];
            Help.setArray(arr);
            double sum=0;
            for (int i = 0; i < arr.length; i++) { sum+=arr[i]; }
            double average=sum/len;
            Help.printLine();
            System.out.println("Average of the given list of numbers is :"+ average);
            Help.end();
        }
        // 3.4  a program to print the elements of an array of strings in reverse order.
        void reverseString(){
            Help.begin();
            System.out.println("Program to print the elements of an array of string in reverse order: ");
            Help.printLine();
            System.out.println("Enter a String to print reverse:");
            String input = Help.in.nextLine();
            Help.printLine();
            System.out.println("Output: ");
            for (int i = input.length()-1; i >= 0; i--) {
                System.out.print(input.charAt(i));
            }
            Help.printLine();
            Help.end();
        }
        // 3.5  a program to print the first 10 numbers of the Fibonacci sequence.
         void nNoOffibonocii(){
            Help.begin();
            System.out.println("Progam to print 10 number of fibonocii: ");
            Help.printLine();
            int num1 = 0;
            int num2 = 1;
            int n =10;
            for (int i = 0; i < n; i++) {
                System.out.print(num1 + " ");
    
                int next = num1 + num2;
                num1 = num2;
                num2 = next;
            }
            System.out.println();            
            Help.end();
         }

        
}

package basics;
import java.util.Scanner;

public class Help {
    public static Scanner in=new Scanner(System.in);
     public static void printLine()
    {
        System.out.println("******************************************");
    }
    public static void end()
    {
        System.out.println("*** End of the program ***");
    }
    public static void begin()
    {
        System.out.println("*** Begin of the program***");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     arr[j+1]=arr[j]+arr[j+1]-(arr[j]=arr[j+1]);
                 }
            }
        }
    }
 

    public static boolean isPalindrome(String str)
    {
        StringBuilder sb=new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
           sb.append(str.charAt(i));
        }
        if (str.toLowerCase().equalsIgnoreCase(sb.toString().toLowerCase())) {
            return true;
        }
        else{
            return false;
        }   
    }
    public static void setArray(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
    }

     public static void setArray(double[] a)
    {
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextDouble();
        }
    }

    public static void setArray(int[][] a,int r, int c)
    {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter "+(i+1)+ "th row and "+(j+1)+ " nth column value");
                a[i][j] = in.nextInt();
            }
        }
    }
    public static void fibonocii(int n)
    {
        int num1=0,num2=1,num3=0;
       System.out.print(num1+ " "+ num2+" ");
       for(int i=2;i<n;i++)
       {
        num3=num1+num2;
        System.out.print(num3+ " ");
        num1=num2;
        num2=num3;
       }
       System.out.println();
    }
    public static void bubbleSort(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]> a[j]) {
                    int tmp= a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

}


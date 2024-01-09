import java.util.Arrays;
import basics.Help;

public class Exercise {
     public static void main(String[] args) {
        new Exercise().smallestIncreasingSubArray();
     }
// 2.1 program to check if a vowel is present in the string.
       void haveVowel(){
        String str1="aAnt";
        String str2="Brklmn";
        System.out.println(isVowel(str1));
        System.err.println(isVowel(str2));
       }

// 2.2  a program to find third largest number in an array.
      void thirdLargest(){
        Help.begin();
        System.out.println("Program to find the Thirs largest number in a array ");
        Help.printLine();
        int[] arr1= {10, 5, 11, 100, 15, 12, 13} ;
        int[] arr2= {0, 1} ;
        int[] arr3={1, 1, 1, 1} ;
        Help.selectionSort(arr1);
        Help.selectionSort(arr2);
        Help.selectionSort(arr3);
        System.out.println("Output: "+thirdLargest(arr1));
        System.out.println("Output: "+thirdLargest(arr2));
        System.out.println("Output: "+thirdLargest(arr3));    
        Help.end();
      } 

//2.3 Write a program to find out if the given string (ignore the spaces in the string) is palindrome or not.
      void  palidromeIgnoreSpace(){

        Help.begin();
        System.out.println("Program to find the givenString is palindrome or not by ignoring Space");
        String str1 = "abBa";
        String str2 = "a     b  cba";
        String str3 = "ab";
        Help.printLine();
        System.out.println(str1 + " is palindrome by ignore space: "+ isPalindromeIgnoreSpace(str1));
        System.out.println(str1 + " is palindrome by ignore space: " + isPalindromeIgnoreSpace(str2));
        System.out.println(str1 + " is palindrome by ignore space: " + isPalindromeIgnoreSpace(str3));
        Help.end();

      }
//2.4 a program to generate Fibonacci series up to given number 'n'. 
      void nFibonocii(){
        Help.begin();
        System.out.println("Program to find the fibonocii Series:-");
        Help.printLine();
        System.out.println("Enter range number to find the fibonocii ");
        int n= ( int ) Help.in.nextDouble();
       fibonociiSeri(n);
       Help.end();
      }

//2.5 program to sort the elements in odd positions in descending order and elements in even positions in ascending order
      void oddDescEvenAsc(){
        Help.begin();
        System.out.println("program to sort the elements in odd positions in descending order and elements in even positions in ascending order");
        Help.printLine();
        int[] arr1= {13, 2, 4, 15, 12, 10, 5};
        int[] arr2= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out1 = sortOddEvenPosition(arr1);
        int[] out2 = sortOddEvenPosition(arr2);

        System.out.println("Input:"+ Arrays.toString(arr1)+"Output "+Arrays.toString(out1));
        System.out.println("Input:"+ Arrays.toString(arr2)+"Output "+Arrays.toString(out2));

      }
 //2.6 Write a program to remove all occurrences of a given character from input String.
        void occurence(){
            Help.begin();
            System.out.println("program to remove all occurrences of a given character from input String");
            Help.printLine();
            System.out.println("Enter a  String");
            String str = Help.in.nextLine();
            Help.printLine();
            System.out.println("Enter a character a remove in the above String");
            char c = Help.in.next().charAt(0);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <str.length() ; i++) {
                char ch = str.charAt(i);
                if (ch!= c) {
                    sb.append(ch);
                }
            }
            Help.printLine();
            System.out.println("After the occurence removed :"+ sb.toString());
        }
//2.7 a program to print the distinct numbers from an integer array.
        void distinct(){
            Help.begin();
            System.out.println("Program to print the distinct numbers from an integer array");
            int[] arr1 ={1, 4, 5, 3, 1, 5};
            int[] arr2 = {1, 4, 5, 3};
            int[] arr3 = {1, 1};
            findDistinct(arr1);
            findDistinct(arr2);
            findDistinct(arr3);
            Help.end();
        }
// 2.8  a program to print the index of the given element in an array.
        void indexPrinting(){
            Help.begin();
        System.out.println("Program to find the index value of the array");
        Help.printLine();
        int[] arr1={1, 5, 3, 7};
        int[] arr2={10, 22, 33, 25, 32, 54, 64, 1};
        System.out.println(printIndex(arr1, 1));
        System.out.println(printIndex(arr2, 100));
        Help.end();
        }
//2.9  the longest increasing sub-array in array. [Note - If there are multiple possibilities, print the first possibility.]
         void longestIncreasingSubArray(){
                Help.begin();
                System.out.println("Program to find  the longest increasing sub-array in array");
                int[] arr1={1, 5, 3, 7};
                int[] arr2 =  {10, 22, 33, 25, 32, 54, 64, 1};
                int[] res1 =findLongestIncreasingSubarray(arr1);
                int[] res2 = findLongestIncreasingSubarray(arr2);
                Help.printLine();
                System.out.println("Input: "+ Arrays.toString(arr1)+ " Output: "+Arrays.toString(res1));
                System.out.println("Input: "+ Arrays.toString(arr2)+ " Output: "+Arrays.toString(res2));
                Help.end();

         }
 //2.10 the smallest increasing sub-array in array. [Note - If there are multiple possibilities, print the first possibility.]
          void smallestIncreasingSubArray(){
                Help.begin();
                System.out.println("prgram to find the smallest increasing sub-array in array.");
                int[] arr1 = {1, 5, 3, 7};
                int[] arr2 = {10, 22, 33, 25, 32, 54, 64, 1};
                int[] res1 = findSmallestIncreasingSubarray(arr1);
                int[] res2 = findSmallestIncreasingSubarray(arr2);
                System.out.println("Input: "+ Arrays.toString(arr1)+ " Output: "+Arrays.toString(res1));
                System.out.println("Input: "+ Arrays.toString(arr2)+ " Output: "+Arrays.toString(res2));

          }
          int[] findSmallestIncreasingSubarray(int[] arr){

            int start = 0;
        int minLength = Integer.MAX_VALUE;
        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentStart = i;
                currentLength = 1;
            }

            if (currentLength < minLength) {
                minLength = currentLength;
                start = currentStart;
            }
        }

        int[] result = new int[minLength];
        System.arraycopy(arr, start, result, 0, minLength);
        return result;
          }



           int[] findLongestIncreasingSubarray(int[] arr) {
            int start = 0;
            int maxLength = 1;
            int currentStart = 0;
            int currentLength = 1;
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    currentLength++;
                } else {
                    currentStart = i;
                    currentLength = 1;
                }
    
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                }
            }
    
            int[] result = new int[maxLength];
            System.arraycopy(arr, start, result, 0, maxLength);
            return result;
        }

           void findDistinct(int[] arr){
            
            Help.bubbleSort(arr);
           // System.out.println(Arrays.toString(arr));
            System.out.println("output:  {");
            for (int i = 0; i < arr.length; i+=2) {
                if (arr[i] == arr[i+1]) {
                    continue;
                }
                else
                System.out.print(arr[i]+","+arr[i+1]+",");
            }
            System.out.print("  }");
            System.out.println();
           
        }
          
        static int[] sortOddEvenPosition(int[] arr){
            int[] oddPos = new int[(arr.length / 2)];
            int[] evenPos = new  int[(arr.length  /2)+1];
            int evenIndex = 0;
            int oddIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i% 2 ==0) {
                    evenPos[evenIndex]= arr[i];
                    evenIndex++;
                }else{
                    oddPos[oddIndex]= arr[i];
                    oddIndex++;
                }
            }
            
            Help.bubbleSort(evenPos);
           // System.out.println("odd pos:"+Arrays.toString(oddPos));
            Help.selectionSort(oddPos);
            //System.out.println("Enve pos:"+ Arrays.toString(evenPos));
            int[] result = new int[arr.length];
             oddIndex =0;evenIndex =0;
            for (int i = 0; i < result.length; i++) {
              if (i% 2 ==0) {
                    result[i]=evenPos[evenIndex];
                    evenIndex++;
                }else{
                    result[i]=oddPos[oddIndex];
                    oddIndex++;
                }
       }
       //System.out.println("Result set :"+ Arrays.toString(result));
        return result;
     }
          


         boolean isPalindromeIgnoreSpace(String isPalindrome){
            isPalindrome = isPalindrome.replaceAll("\\s", "");
            for (int i = 0; i < isPalindrome.length(); i++) {
                if (isPalindrome.charAt(i)!= isPalindrome.charAt(isPalindrome.length() - i -1)) {
                    return false;
                }
            }
            return true;
         }

        int printIndex(int[] a,int find){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==find) {
                return i;
            }
        }
        return -1;
        }
       void fibonociiSeri(int n){
        int num1=0,num2=1,num3=0;
           System.out.print(num1+ " "+ num2+" ");
           for(int i=2;i<n;i++)
           {
            num3=num1+num2;
            if (num3 >n) {
                break;
            } 
            System.out.print(num3+ " ");
           
            num1=num2;
            num2=num3;
           }
           System.out.println();
        }
       private  boolean  isVowel(String str)
       {
           char[] ch=str.toCharArray();
           int i=0;
           while (i < ch.length) {
               if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'
                   || ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                   return true;
               }
               i++;
           }
           return false;
       }

       private int thirdLargest(int[] a)
       {
          if (a.length < 3 ) {
           return -1;
          }
          int dCount=1;
          int TrdL=a[a.length - 1];
   
          for (int i = a.length - 2; i >= 0; i--) {
           if (a[i] != TrdL) {
               TrdL= a[i];
               dCount++;
               if (dCount == 2) {
                   return TrdL;
               }
           }
          }
       return 1;
   
       }
    
}

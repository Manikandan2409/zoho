import java.util.Arrays;

import basics.Help;

public class AdvancedArrayManipulation {
    public static void main(String[] args) {
        new AdvancedArrayManipulation().rotateElemByPosition();
    }

    // 6.1 a program to find the second largest element in an array of integers.
    void secondLargestElemArray() {
        Help.begin();
        System.out.println("Program to find the second largest element in an array of integers");
        Help.printLine();
        System.out.println("Enter the maximum size of an array: ");
        int len = Help.in.nextInt();
        int[] array = new int[len];
        Help.setArray(array);
        Help.selectionSort(array);

        int seclar = array[len - 1];
        for (int i = len - 2; i > 0; i--) {
            if (seclar != array[i]) {
                seclar = array[i];
                break;
            }
        }
        Help.printLine();
        System.out.println("Second largest :" + seclar);
        Help.end();

    }
    // 6.2 a program to find smallest and largest number in an array
    void smallestAndlargestElem(){
        Help.begin();
        System.out.println("Program to find smallest and largest elements of an array");
        Help.printLine();
        System.out.println("Enter the size of an array ");
        int len = Help.in.nextInt();
        int[] array = new int[len];
        Help.setArray(array);
        Help.selectionSort(array);
        int smallest = array[0];
        int largest = array[len-1];
        System.out.println("Smallest Value :"+ smallest + " , Largest Value: "+ largest);
        Help.end();
    }
    // 6.3  a proram to sort an array of integers in both ascending and descending
    void ascAndDesc(){
         Help.begin();
        System.out.println("program to sort an array of integers in ascending and descending order");
        Help.printLine();
        
        System.out.println("Enter the size of an array");
        int[] array = new int[Help.in.nextInt()];
        Help.setArray(array);
        Help.printLine();
        
        Help.selectionSort(array);
        System.out.println("Sorted array in Ascending order");
        System.out.println(Arrays.toString(array));

        Help.bubbleSort(array);
        System.out.println("sorted array  in descending order");
        System.out.println(Arrays.toString(array));

    }
    // 6.4 program to rotate the elements of an array by a given number of positions.
        void rotateElemByPosition(){
            Help.begin();
        System.out.println("Program to rotate the elements of an array by a given number of positions.");
        Help.printLine();
        
        System.out.println("Enter the size of the array");
        int[] array = new int[Help.in.nextInt()];
        Help.setArray(array);

        Help.printLine();
        System.out.println("Enter how much position the elements have to move");
        int pos = Help.in.nextInt();
        pos = pos % array.length;

        int[] tmp = new int[array.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
           int nPos = (i - pos +array.length) % array.length;
           array[nPos] = tmp [i]; 
        }
        System.out.println("Array elements before rotate :"+ Arrays.toString(tmp));
        System.out.println(" array elements moved to "+ pos +" positions "+ Arrays.toString(array));

        }
    // 6. 5  program to find the common elements between two arrays of integers.
     void commonElementsInArrays(){
        Help.begin();
        System.out.println("Program to find te comman elements in  two arrays");
        Help.printLine();

        System.out.println("Enter size of the 1 st array");
        int[] arr1 = new int[Help.in.nextInt()];
        Help.setArray(arr1);

        System.out.println("Enter size of the 2nd Array ");
        int[] arr2 =new int[Help.in.nextInt()];
        Help.setArray(arr2);

        System.out.println("Comman Elements in both arrays ");
        Help.printLine();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] - arr2[j] == 0) {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        Help.end();

     }
     //6.6  sum of two matrices of the same size.
     void sumOfMatrix(){
        Help.begin();
        System.out.println("Program to print the sum of matrix ");
        Help.printLine();
        System.out.println("Enter the row count of the matrix 1");
        int row1 = Help.in.nextInt();
        System.out.println("Enter the column count of the matrix 1");
        int col1 = Help.in.nextInt();
        int[][] arr1 = new int[row1][col1];
        Help.setArray(arr1,row1,col1);

        Help.printLine();
        System.out.println("Enter the row count of the matrix 2");
        int row2 = Help.in.nextInt();
        System.out.println("Enter the column count of the matrix 2");
        int col2 = Help.in.nextInt();
        int[][] arr2 = new int[row2][col2];
        Help.setArray(arr2,row2,col2);

        if ( (row1 !=row2 || col1 != col2)) {
            System.out.println("size of the matrix are not matched ");
            return;
        }
        int[][] res = new int[row1][col1];

        System.out.println("Sum of the two array is ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
        Help.end();
     }
     // 6.7 program to find the transpose of a matrix.
     void transposeMatrix(){
        Help.begin();
        System.out.println(" Program to find the transpose of a matrix.");
        Help.printLine();
        System.out.println("Enter the row count of the matrix");
        int row = Help.in.nextInt();
        System.out.println("Enter the column count of the matrix");
        int col = Help.in.nextInt();
        Help.printLine();
       
        int[][] arr = new int[row][col];
        Help.setArray(arr, row, col);
       System.out.println("Original Matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
       }

        int[][] transpose = new int[col][row];
        System.out.println("Transporse Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
                //System.out.print(transpose[i][j]+ " ");
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        Help.end();
    }
    // 6.8  program to multiply two matrices of compatible dimensions.
    void matrixMultiplication(){
        Help.begin();
        System.out.println("program to multiply two matrices of compatible dimensions.");
        Help.printLine();
        System.out.println("Enter the row count of the matrix 1");
        int row1 = Help.in.nextInt();
        System.out.println("Enter the col count of the matrix 1");
        int col1 = Help.in.nextInt();

        int[][] arr1= new int[row1][col1];
        Help.setArray(arr1, row1, col1);
        
        Help.printLine();
        System.out.println("Enter the row count of the matrix 2");
        int row2 = Help.in.nextInt();
        System.out.println("Enter the col count of the matrix 2");
        int col2 = Help.in.nextInt();
        int[][] arr2= new int[row2][col2];
        Help.setArray(arr2, row2, col2);

        System.out.println("Matrix 1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(arr1[i][j]+" ");
            }System.out.println();
        }
        
        System.out.println("Matrix 1");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(arr2[i][j]+" ");
            }System.out.println();
        }
        
        if ( (row1 !=row2 || col1 != col2)) {
            System.out.println("size of the matrix are not matched ");
            return;
        }
        
        int[][] res = new int[row1][col1];
        System.out.println("Multiplication of the above tow matrix ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                res[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
        Help.end();
    }
    
}

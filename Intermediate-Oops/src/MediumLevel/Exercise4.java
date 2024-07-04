package MediumLevel;

import java.util.Arrays;

/*
 * Implement a binary search algorithm in Java to search for an element in an array.
 */
/**
 * BinarySearch
 */
class BinarySearch {
     public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
             
                return binarySearch(arr, mid + 1, r, x);
        }
 

        return -1;
    }
    
}
public class Exercise4 {
    public static void main(String[] args) {
        BinarySearch searcch = new BinarySearch();
        int[] arr = new int[]{45,23,54,43,56,98,765};
        Arrays.sort(arr);
        int location=searcch.binarySearch(arr,0,arr.length-1,98);
        switch (location) {
            case -1:
                System.out.println("Value not fount");
                break;
            default:
            System.out.println("Value found at the the index "+location);
                break;
        }
    }
}

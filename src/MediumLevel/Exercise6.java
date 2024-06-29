package MediumLevel;

import java.util.Arrays;

/*
 * Implement a binary search algorithm in Java to search for an element in an array.
 */
/**
 * BinarySearch
 */
class BinarySearch {
    private int[] values;
    final int begin=0;
 
    public void setValues(int[] values) {
        this.values=new int[values.length];
        for (int i = 0; i < values.length; i++) {
            this.values[i]=values[i];
        }
    }
    public void binarySearch(int find){
        for (int i = 0; i < values.length; i++) {
            for (int j = i; j < values.length; j++) {
                if (values[i]>values[j]) {
                    values[j]=values[i]+values[j]-(values[i]=values[j]);
                }
            }
        }
        System.out.println(Arrays.toString(values));
        int begin =0;
        int end = values.length;
        int mid = values.length /2;

        while (begin<= end) {
            if (values[mid]== find) {
                System.out.println("Element is present in the array!!");
                return;
            }else if (values[mid]< find) {
                begin= mid+1;
                mid = (begin+end)/2;
                //System.out.println("inside the less than mid");
            }
            else if (values[mid]>find) {
                end = mid -1;
                mid = (begin+end)/2;
               // System.out.println("Insdie greater");
            }
            
        }
        System.out.println("Element not found");
    }
    
}
public class Exercise6 {
    public static void main(String[] args) {
        BinarySearch searcch = new BinarySearch();
        searcch.setValues(new int[]{45,23,54,43,56,98,765});
        searcch.binarySearch(765);
    }
}

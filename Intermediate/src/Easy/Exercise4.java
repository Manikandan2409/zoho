package Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Max
 */
class Max {
    public int findMax(int[] nums){
       int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest< nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }
    
}
public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Array :");
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
           System.out.print("Enter "+(i+1)+" th element :");
            nums[i] = in.nextInt();
        }
        Max m = new Max();
        System.out.println("Largest Element of the Array "+ Arrays.toString(nums)+" is :"+ m.findMax(nums));
        in.close();
    }
    
}

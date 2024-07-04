package Easy;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Average
 */
class Average {
 public int CalculateAverage(int[] arr){
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    return sum / arr.length;
 }
     
}
public class Exercise1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter number  of elements you like to take average :");
        int[] nums = new int[in.nextInt()];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter "+ (i+1)+" th number :");
            nums[i] = in.nextInt();
        }     
        Average average = new Average();
        System.out.println("Average of the numbers "+ Arrays.toString(nums)+ " :"+ average.CalculateAverage(nums));
        in.close();
    }
}

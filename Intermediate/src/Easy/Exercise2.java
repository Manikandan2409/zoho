package Easy;

import java.util.Scanner;

/**
 * Reverse
 */
class Reverse {
    public String reverseString(String str){
        char[] num = str.toCharArray();
        
        for (int i = 0,j=num.length-1; i <= j; i++,j--) {
            char ch = num[i];
            num[i]=num[j];
            num[j] = ch;
        }
        return new String(num);
       
    }
    
}
public class Exercise2 {
    public static void main(String[] args) {
        Reverse rev = new Reverse();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Reversing the String "+str +" :"+ rev.reverseString(str) );
        in.close();
    }
}

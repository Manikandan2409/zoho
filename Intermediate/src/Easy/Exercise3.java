package Easy;

import java.util.Scanner;

/**
 * IsPalin
 */
class IsPalin {
    boolean isPalindrome(String str){
        char[] strValue = str.toCharArray();
     for (int i = 0; i < strValue.length /2; i++) {
            if (strValue[i] !=strValue[strValue.length -1 -i]) {
                return false;
            }
     }
     return true;
    }
    
}

public class Exercise3 {
        public static void main(String[] args) {
            System.out.println("Palindrome or Not !!");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            IsPalin is = new IsPalin();
            System.out.println(str +" is Palindrome :"+ is.isPalindrome(str));
            in.close();
        }
}

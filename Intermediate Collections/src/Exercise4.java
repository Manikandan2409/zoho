/*4) Write a program to get user input using IO classes.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    @Deprecated
    public static void main(String[] args) {
         System.out.println("Enter a value");
          try {
            System.out.println(" reading values by using Buffer Reader in system class in object ");
            int i =System.in.read();
           i = i- '0';
            
           System.out.println("i= "+ ((int)i));
           System.out.println("Reading input using  Data input Stream");
          // System.in.read();

           DataInputStream in = new DataInputStream(System.in);
          in.readLine();
           int j = Integer.parseInt(in.readLine());
          // j =  Integer.MIN_VALUE - j;
           System.out.println(" j = "+j);
       
           System.out.println("Reading values with input Stream reader");
           InputStreamReader isr = new InputStreamReader(in);

            int k = isr.read();
            k=k-'0';
            System.out.println("k =" + k);
            System.out.println("Reading values bt Buffered Reader ");
            BufferedReader bf = new BufferedReader( isr);
            bf.readLine();
            int l = bf.read();
            l=l-'0';
            System.out.println("l ="+ l);
            bf.close();
            isr.close();
            in.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }    
}

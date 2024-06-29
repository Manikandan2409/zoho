package advanced;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Create a Java program that demonstrates the use of ArrayList and LinkedList by adding, removing, and accessing elements 
 * in both collections. Compare their performance for large data sets.
 */

 public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer>  ll = new LinkedList<>();
        int iteration=20000;

        //Insertion
        long sTime = System.currentTimeMillis();
     
        for (int i = 0; i < iteration; i++) {
            al.add(i);
        }
        long eTime = System.currentTimeMillis();
        long alDuration = eTime - sTime;
        System.out.println("Arraylist insrtion time "+ alDuration + "ms");
        sTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            ll.add(i);
        }
        eTime = System.currentTimeMillis();
      
        long llDuration = eTime - sTime;
        System.out.println("Linked list insertion time:"+ llDuration+" ms");
       
        //Accessing
         sTime = System.currentTimeMillis();
         
         for (int i = 0; i < iteration; i++) {
            al.get(i);
         }
         eTime = System.currentTimeMillis();
         alDuration = eTime - sTime;
         System.out.println("Arraylist accessing time :"+ alDuration+ " ms");
         sTime = System.currentTimeMillis();
         for (int i = 0; i < iteration; i++) {
            ll.get(i);
         }
         eTime = System.currentTimeMillis();

         llDuration = eTime - sTime;
         System.out.println("Linkes list accessgin time "+ llDuration+ " ms");

        //Removing 
        sTime = System.currentTimeMillis();
        for (int i = iteration-1; i >=0; i--) {
           
            al.remove(i);
        }
        
        
        eTime = System.currentTimeMillis();
        alDuration = eTime - sTime;
        System.out.println("Arraylist removing time :"+ alDuration+ "ms");
        sTime = System.currentTimeMillis();
        
       
        for (int i = iteration-1; i >=0; i--) {
            //System.out.println(i+ "linkedlist");
            ll.remove(i);
        }
        eTime = System.currentTimeMillis();
        
        
        llDuration = eTime - sTime;
        System.out.println("Linked list removing time :"+ llDuration+ " ms");
      
        
    }
  
}
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args) {
        
        int size = Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);
        size = Integer.MAX_VALUE /10000;
        System.out.println("size :"+ size);
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
    System.out.println();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            ll.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Arraylist insert duration :"+ (end - start));

         start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            al.add(i);
        }
         end = System.currentTimeMillis();
        System.out.println("Linked-list insert duration :"+ (end - start));

        System.out.println();
    
         start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            al.get(i);
        }
         end = System.currentTimeMillis();
        System.out.println("Arraylist accessing duration :"+(end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            ll.get(i);
        }
         end = System.currentTimeMillis();
        System.out.println("Linkedlist accessing duration :"+(end - start));

        System.out.println();
    
        start = System.currentTimeMillis();
        // for (int i = 0; i < size; i++) {
        //     al.remove(i);
        // }
        while (al.isEmpty()) {
            al.remove(0);
        }
         end = System.currentTimeMillis();
        System.out.println("Arraylist removing duration :"+(end - start));

        start = System.currentTimeMillis();
        while (ll.isEmpty()) {
            ll.remove(0);
        }
         end = System.currentTimeMillis();
        System.out.println("Linkedlist remove duration :"+(end - start));

    }
    
}

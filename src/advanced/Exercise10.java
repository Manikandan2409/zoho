package advanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * CollectionSorting
 */
class CollectionSorting {

    
}
public class Exercise10 {
    int size =5000;
    List<Integer> al = generateRandomList(size,new ArrayList<>());
    List<Integer> ll = generateRandomList(size,new LinkedList<>());
    List<Integer> selectionAl= new ArrayList<>(al);
    List<Integer> selectionLl = new ArrayList<>(ll);
     
    public static void main(String[] args) {
        Exercise10 t = new Exercise10();
        






    }
    
    private static List<Integer> generateRandomList(int size, List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100000));
        }
        return list;
    }
    
    private static List<Integer> selectionSort(List<Integer> list){
        int s = list.size();
        for (int i = 0; i < s -1; i++) {
            for (int j = 1; j < s-i-1; j++) {
                if (list.get(i)< list.get(j)) {
                    int t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
            }
        }
        return list;
    }
}

package advanced;
/*
 * Create a HashMap in Java that stores a set of words as keys and their frequencies as values.
 * Implement a method that takes a string as input, splits it into words, and updates the HashMap with their frequencies.
 * Test the method with different inputs
 */
/**
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.io.*;

class Test3  {
 private HashMap<String,Integer> hMap = new HashMap<>();
    protected void getLine(String line){
        String[] words = line.split("\\s+");
        for (String w : words) {
            w = w.replaceAll("[^a-zA-Z]", w).toLowerCase();
            hMap.put(w, hMap.getOrDefault(w, 0)+1);
        }
    }
    protected void printFrequency(){
        for ( HashMap.Entry<String,Integer>  m: hMap.entrySet()) {
            System.out.println(m.getKey()+" : "+ m.getValue());
        }
    }
    
}
class Two {
    private BufferedReader bf;
    private ArrayList<String> file;
    protected  void loadtoBufferReader(String name){
        try {
            FileReader fr = new FileReader(name);
        bf = new BufferedReader(fr);
        //System.out.println("File loaded to buffer reader");
        } catch (Exception e) {
            System.out.println("File not FOund");
            e.printStackTrace();
        }     
    }
    protected void readContents(){
      String line;
      file = new ArrayList<>();
        try {
            while ((line= bf.readLine())!=null) {
                file.add(line);   
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    public void displayDate(){
        Iterator i = file.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    public ArrayList getData(){
        return file;
    }
    
}

public class Exercise3 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        Two two = new Two();
        two.loadtoBufferReader("src\\advanced\\example.txt");
        two.readContents();
        ArrayList al = two.getData();
      for (int i = 0; i < al.size(); i++) {
        t.getLine(al.get(i).toString());
        t.printFrequency();
      }
    }    
}

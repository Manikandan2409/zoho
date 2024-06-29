package MediumLevel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Set;
/*
 * Write a program that reads a text file and counts the number of occurrences of each word in the file.
 * The program should display the results in alphabetical order.
 */
class WordCount {
   private Map<String,Integer> distinctWords = new HashMap<>();   
    void readLine() {
        ArrayList<String[]> lines = new ArrayList<>();
        try {
            
            FileInputStream fin = new FileInputStream("src\\MediumLevel\\WordCount.txt");
            BufferedReader bf = new BufferedReader(new InputStreamReader(fin));

            String line;
            while ((line = bf.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                ArrayList<String> words = new ArrayList<>();
               

                while (tokenizer.hasMoreTokens()) {
                    String tmp = tokenizer.nextToken();
                     words.add(tmp);
                     distinctWords.put(tmp,distinctWords.getOrDefault(tmp, 0)+1);    
                   // System.out.print(tmp + " ");
                }

                String[] lineArray = new String[words.size()];
                lineArray = words.toArray(lineArray);
                lines.add(lineArray);
                bf.close();
                fin.close();
                //System.out.println(Arrays.toString(lineArray) + " inserted Successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void print(){
        Set<String> words = distinctWords.keySet();
        ArrayList<String> list = new ArrayList<>(words);
        Collections.sort(list);
       for (String string : list) {
        System.out.println(string +" : "+ distinctWords.get(string));
       }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        WordCount count = new WordCount();
        count.readLine();
        count.print();
    }
}

/*2) Write a program that reads a text file and counts the number of occurrences of each word in the file. The program should display the results in alphabetical order.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        File file = new File("src/sample.txt");
        FileReader fr;
        HashMap<String,Integer> occurence = new HashMap<>();
        try {
            fr = new FileReader(file);
            
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine())!= null) {
                    
                    String[] words = line.trim().split("\\s+");

                    for (String string : words) {
                        occurence.put(string, occurence.getOrDefault(string, 0)+1);
                    }
                }
               br.close();
               fr.close(); 
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Set<String>  keys= occurence.keySet();
        List<String> keyslist = new ArrayList<>(keys);
        Collections.sort(keyslist);

        for (String key : keyslist) {
            System.out.println(key +" = "+ occurence.get(key));
        }
    }   
}

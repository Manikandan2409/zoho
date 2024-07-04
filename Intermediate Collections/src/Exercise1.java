/*1) Write a program to find the no of words and lines in a text file. */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {
        String filename ="src/sample.txt";
        int line_count =0;
        int word_count = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String s;

            while ((s = br.readLine()) != null) {
                line_count++;

                System.out.println(s);   
              String[] words=  s.split("\\s+");
            word_count+=words.length;
            
        }
        br.close();
        fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        System.out.println(filename +" contains "+ line_count+ " lines and "+ word_count+ " words");
    }
}

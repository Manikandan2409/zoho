/*
18) Write a Java program that reads a file using BufferedReader and stores the data into an ArrayList.
Use Iterator to traverse the list and display the content. */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
public static void main(String[] args) {
    List<String> filecontents = new ArrayList<>();
    File filename = new File("src\\sample.txt");
    try {
        FileReader fr = new FileReader(filename);
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line=br.readLine())!= null) {
                filecontents.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    for (String line : filecontents) {
        System.out.println(line);
    }
}    
}

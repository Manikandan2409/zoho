package MediumLevel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/*
 * Write a program that reads a CSV file line by line and and stores the data into a HashMap with column name as a key and entries as value. 
 */
public class Exercise5 {
    public static void main(String[] args) {
        HashMap<String,String> csvContents =new HashMap<>();
        try{
            FileReader fin = new FileReader("src\\MediumLevel\\test.csv");
            BufferedReader bf = new BufferedReader(fin);
            String str;
            while ( (str = bf.readLine())!=null) {
                String[] csv = str.split(",");
                csvContents.put(csv[0], csv[1]);
            }
            bf.close();
            fin.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        for (Map.Entry<String,String> line : csvContents.entrySet()) {
            System.out.println(line.getKey() +","+ line.getValue());
        }
    }
}

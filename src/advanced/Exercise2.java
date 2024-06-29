package advanced;
import java.io.BufferedReader;
/*
 * •	Write a Java program that reads a file using BufferedReader and stores the data into an ArrayList
 *       Use Iterator to traverse the list and display the content.
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
public class Exercise2 {
    public static void main(String[] args) {
        Two fileReading = new Two();
        fileReading.loadtoBufferReader("src\\advanced\\example.txt");
        fileReading.readContents();
        fileReading.displayDate();
    }
}

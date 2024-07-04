import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class StudentRecord{
    private String id;
    private String name;
    
    public StudentRecord(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        return "ID: "+ this.id+" Name: "+ this.name;
    }


}

public class Exercise14 {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private  Set<StudentRecord> cs_Students = new HashSet();
    public static void main(String[] args) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Set<StudentRecord> cs_Students = new HashSet();
        Exercise14 ex = new Exercise14();
        File file = new File("src\\sample2.csv");
        try {
            FileReader fr = new FileReader(file);
            
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] tokens = line.split(",");
                    if (tokens.length >= 2) {
                        ex.cs_Students.add(new StudentRecord(tokens[0], tokens[1].trim()));
                        System.out.println("Added student: " + tokens[0] + ", " + tokens[1].trim());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fr.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (StudentRecord student : cs_Students) {
            System.out.println(student);
        }

        Scanner in = new Scanner(System.in);
        
        while (true) {
            
        System.out.println("Enter Roll no to Search :");

        String search = in.nextLine();
        StudentRecord find = ex.searchStudent(search);
        if (find == null) {
            System.out.println("No Record Found in the name");
            
        }else{
            System.out.println("Student Details :"+ find);
            break;
        }

        }
       in.close();
    }

    private  StudentRecord searchStudent(String id) {
        System.out.println("Searching for ID: " + id);
      
        for (StudentRecord sr : cs_Students) {
            System.out.println("Comparing with ID: " + sr.getId());
            
            if (sr.getId().equalsIgnoreCase(id)) {
                System.out.println("Found match: " + sr);
                return sr;
            }
        }
        System.out.println("No match found.");
        return null;
    }
    
    
    
    
    
}

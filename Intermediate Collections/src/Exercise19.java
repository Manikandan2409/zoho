import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable{
    private String id;
    private String name;
    
    Employee(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID: "+id+" Name: "+name;
    }
}
public class Exercise19 {
    public static void main(String[] args) {
   

        try (FileOutputStream fout = new FileOutputStream("src//serialisation.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("22us23", "Manikandan "));
            employees.add(new Employee("22us24", "Mathavan Ashok"));
            employees.add(new Employee("22us25", "Mukesh Kumar"));

            oos.writeObject(employees);
            System.out.println("Object Serialised successfully in the file");
            oos.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
System.out.println("hi");
        try (FileInputStream fin = new FileInputStream("src//serialisation.txt")) {
            
            ObjectInputStream ois = new ObjectInputStream(fin);
            @SuppressWarnings({ "rawtypes", "unchecked" })
            List<Employee> employees = (ArrayList)ois.readObject();

            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } catch (Exception e) {
    
        }



    }
}

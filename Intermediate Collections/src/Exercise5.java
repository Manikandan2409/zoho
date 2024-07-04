import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Exercise5 {
    public static void main(String[] args) {
        File file = new File("src/sample2.csv");
        HashMap<String,String> csvcontent = new HashMap<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine())!= null) {
                StringTokenizer st = new StringTokenizer(line,",");
                while (st.hasMoreTokens()) {

                    csvcontent.put(st.nextToken(),st.nextToken() );
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(csvcontent);
    }
}

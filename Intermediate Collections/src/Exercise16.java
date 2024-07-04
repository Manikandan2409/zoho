import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise16 {

    private static final byte[] KEY = "22us23".getBytes(); 

    public static void main(String[] args) {
        String inputFile = "src\\input.txt"; // File to be encrypted
        String encryptedFile = "src\\encrypted.txt"; // Encrypted file
        String decryptedFile = "src\\decrypted.txt"; // Decrypted file
      
        encryptFile(inputFile, encryptedFile);

        decryptFile(encryptedFile, decryptedFile);
    }

    private static void encryptFile(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            int data;
            int keyIndex = 0;
            while ((data = fis.read()) != -1) {
     
                fos.write(data ^ KEY[keyIndex]);
                keyIndex = (keyIndex + 1) % KEY.length;
                System.out.println(keyIndex);
                
            }
            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    private static void decryptFile(String inputFile, String outputFile) {
        encryptFile(inputFile, outputFile);
        System.out.println("File decrypted successfully.");
    }
}

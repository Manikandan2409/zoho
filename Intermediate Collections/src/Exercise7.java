/*7) Create a custom exception and use it in a program. */

import java.util.regex.Pattern;

class InValidMailException extends Exception{
    public InValidMailException(String message){
        super();
    }
}

public class Exercise7 {
    
   
    private static boolean validateMail(String mail){
          String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(mail).matches();
        
    }
    public static void main(String[] args) {

        String[] emails = {"test@example.com", "invalid^.com", "test@@example.com"};
        for (String mail : emails) {
            try {
                if (validateMail(mail)) {
                    System.out.println(mail +" is valid mail!");
                }else{
                    System.out.println(mail + " invalid mail address");
                    throw new InValidMailException(mail+ "is invalid");
                }
            } catch (InValidMailException e) {
              e.printStackTrace();
            }
        }
    }
}

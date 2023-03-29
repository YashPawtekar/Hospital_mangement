package login;
import java.util.*;

interface log {
    public void userLogin(String section);

    public void loginData(String name, String password);
}

public class login implements log {
    public void loginData(String Email, String password) {
    
    adminData adminData= new adminData();
    for(int i=0; i<adminData.admin.length; i++){
      for(int j=0;j<1; j++){
        // System.out.print(adminData.admin[i][2]);
        String emailU = adminData.admin[i][2];
        if(Email == emailU){
          // System.out.print(adminData.admin[i][j]);
          System.out.println("Yes");
        }
      }
      System.out.println();
    }
   
    }
    public void userLogin(String section) {
        if (section == "Admin") {
            System.out.println("");
            System.out.println("Please enter email");
            Scanner scan4 = new Scanner(System.in);
            String email = null;
            String password = null;
            try {
              email = scan4.next();
            } catch (Exception e) {
              System.out.println("Some problem" + e);
            }
            System.out.println("Please enter password");
            Scanner scan5 = new Scanner(System.in);
            try {
              password = scan5.next();
            } catch (Exception e) {
              System.out.println("Some problem" + e);
            }
      
            loginData(email, password);          
 

        } else if (section == "Doctor") {
            System.out.println("login Doctor");
        } else if (section == "Patient") {
            System.out.println("login Patient");
        }
    }

   

}
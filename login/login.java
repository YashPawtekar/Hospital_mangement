package login;
import java.util.*;

interface log {
    public void userLogin(String section);

    public void loginData(String name, String password);
}

public class login implements log {
    public void loginData(String name, String password) {
    //   System.out.println(name);
    //   System.out.println(password);
    adminData adminData= new adminData();
    System.out.println(Arrays.toString(adminData.admin[1]));
   
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
package login;

interface log {
    public void userLogin(String section);

    public void loginData(String name, String password);
}

public class login implements log {
    public void loginData(String name, String password) {
      System.out.println(name);
      System.out.println(password);
    }
    public void userLogin(String section) {
        if (section == "Admin") {
            System.out.println("login Admin");
        } else if (section == "Doctor") {
            System.out.println("login Doctor");
        } else if (section == "Patient") {
            System.out.println("login Patient");
        }
    }

   

}
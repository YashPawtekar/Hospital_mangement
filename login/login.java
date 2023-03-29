package login;

// public class login{
//     public void userLogin(String section) {
//         if (section == "Admin") {
//             System.out.println("login Admin");
//         } else if (section == "Doctor") {
//             System.out.println("login Doctor");
//         } else if (section == "Patient") {
//             System.out.println("login Patient");
//         }
//     }
// }

interface log {
    public void userLogin(String section);

    public void loginData();
}

public class login implements log {
    public void loginData() {

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
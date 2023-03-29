import admin.admin;
import doctor.doctor;
import patient.patient;
import login.login;
import java.util.*;

class startApp {
   public  void adminC() {
        admin ad = new admin();
        ad.adminStart();
    }

    public void doctorC() {
        doctor doc = new doctor();
        doc.doctorStart();
    }

    public void patientC() {
        patient pat = new patient();
        pat.patientStart();
    }
   public void loginC(){
       
       
    }

    void start() {
        adminC();
        doctorC();
        patientC();
        // ulogin login= new ulogin();
        login login= new login();
        System.out.println("Please select any option . . .");
        int option = 0;
        Scanner scan = new Scanner(System.in);

        try {
            option = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("Please enter any option");
            System.out.println(" ");
        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Please invaild option");
            System.out.println(" ");
        } finally {
            scan.close();
        }
       
        if (option == 1) {
            String sec = "Admin";
            login.userLogin(sec);
        } else if (option == 2) {
            String sec = "Doctor";
            login.userLogin(sec);
        } else if (option == 3) {
            String sec = "Patient";
            login.userLogin(sec);
        }
    }

}

public class app {
    public static void main(String[] args) {
        startApp startApp = new startApp();
        startApp.start();
    }

}
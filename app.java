import admin.*;
import doctor.doctor;
import patient.patient;
import medical.medical;
import appointment.*;
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
    public void medicalC() {
        medical med = new medical();
        med.medicalStart();
    }
    public void appointmentC() {
        appointmentMangement appointM = new appointmentMangement();
        appointM.appointMangementStart();
    }

    void start() {
        System.out.println("*************************************"); 
        System.out.println("");
        System.out.println(" * * * Welcome to My Hospital * * * ");
        System.out.println("");
        System.out.println("*************************************"); 
        adminC();
        doctorC();
        patientC();
        medicalC();
        appointmentC(); 
        System.out.println("6. Exit");
        System.out.println(" ");
        admin admin=new admin();
        doctor doctor = new doctor();
        patient patient = new patient();
        appointmentMangement appointmentMangement = new appointmentMangement();
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
            // scan.close();
        }
       
        if (option == 1) {
            System.out.println("");
            System.out.println("Welcome to Admin Panel");
            System.out.println("*************************************"); 
            admin.adminOption();

        } else if (option == 2) {
            System.out.println("");
            System.out.println("Welcome to Doctor Panel");
            System.out.println("*************************************"); 
            doctor.doctorOption();
        } else if (option == 3) {
            System.out.println("");
            System.out.println("Welcome to Patient Panel");
            System.out.println("*************************************"); 
            patient.patientOption();
        }else if (option == 4) {
            System.out.println("");
            System.out.println("Welcome to Medical Record Management");
            System.out.println("*************************************"); 
        }else if (option == 5) {
            System.out.println("");
            System.out.println("Welcome to Appointment Management");
            System.out.println("*************************************");
            appointmentMangement.appointMangementOption();
        }else if (option == 6) {
            System.out.println("");
            System.out.println("close");
            System.out.println("*************************************"); 
        }
    }

}

public class app {
    public static void main(String[] args) {
        startApp startApp = new startApp();
        startApp.start();
    }

}
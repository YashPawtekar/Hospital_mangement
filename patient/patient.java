package patient;
import java.util.*;
import login.login;
import registration.registration;

interface patie{
  public void patientStart();
  public void patientOption();
  public void patientOptionMore();
}

public class patient implements patie {
  login login = new login();
  public void patientStart(){
    System.out.println("3. Patient Management");
  }
  public void patientOption(){
    System.out.println("");
    System.out.println("1. Registration");
    System.out.println("2. Login");
    System.out.println("");
    System.out.println("Please select any option . . .");

    Scanner scan3 = new Scanner(System.in);
    int optionAdmin = 0;
    try {
      optionAdmin = scan3.nextInt();
    } catch (Exception e) {
      System.out.println("Some error " + e.getMessage());
    } 

    if (optionAdmin == 1) {
      registration registrat = new registration();
      registrat.registra("Patient");
    } else if (optionAdmin == 2) {
      login.userLogin("Patient");
    }
  }
  public void patientOptionMore(){
    System.out.println(" . . . Welcome to Patient Management  . . . ");
    System.out.println(" ");
    System.out.println("1. Make appointment");
    System.out.println("2. Appointment status");
    System.out.println("3. Cancel appointment");
    System.out.println("4. Payment");
    System.out.println("");
  }
}

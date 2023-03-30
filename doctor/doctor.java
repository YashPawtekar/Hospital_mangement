package doctor;
import java.util.*;
import login.*;
import registration.registration;

interface doct{
   public void doctorStart();
   public void doctorOption();
   public void doctorOptionMore();
}


public class doctor implements doct{
  login login = new login();
    public void doctorStart(){
        System.out.println("2. Doctor Management");
      }

    public void doctorOption(){
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
        registrat.registra("Doctor");
      } else if (optionAdmin == 2) {
        login.userLogin("Doctor");
      }
    }
    public void doctorOptionMore(){
      System.out.println(" . . . Welcome to Doctor Management  . . . ");
      System.out.println(" ");
      System.out.println("1. Confirm appointment");
      System.out.println("2. Add prescription");
      System.out.println("3. Cancel appointment");
      // System.out.println("4. Refund payment");
      System.out.println("");
    }
}

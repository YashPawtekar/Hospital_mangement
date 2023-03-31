package admin;
import java.util.*;
import login.*;
import registration.registration;
import appointment.*;

interface ad {
  public void adminStart();

  public void adminOption();
  public void adminOptionMore();
}

public class admin implements ad {
  login login = new login();
  
  public void adminStart() {
    System.out.println("1. Admin Management");
  }
 

  public void adminOption() {
  
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
      System.out.println("Please enter number" + e.getMessage());
    } 

    if (optionAdmin == 1) {
      registration registrat = new registration();
      registrat.registra("Admin");
    } else if (optionAdmin == 2) {
      login.userLogin("Admin");
    }
  }


  public void adminOptionMore() {
    System.out.println(" . . . Welcome to Admin Management. . . ");
    System.out.println(" ");
    System.out.println("1. Appointment Management");
    System.out.println("2. Generate Bill");
    System.out.println("3. New Doctor Add");
    System.out.println("4. Edit Doctor");
    System.out.println("5. Refund Payment");
    System.out.println("");
    System.out.println("Please select any one option");
    Scanner scan5 = new Scanner(System.in);
    int option5=0;
    try{
      option5= scan5.nextInt();
    }catch(Exception e){
      System.out.println("Please enter number");
    }
    
    if(option5 == 1){
      appointmentMangement appointmentMangement = new appointmentMangement();
      appointmentMangement.appointStart();
    }else{
      System.out.println("Thank you for your input");
    }
   
  }
}

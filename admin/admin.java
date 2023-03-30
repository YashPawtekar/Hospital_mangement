package admin;
import java.util.*;
import login.*;
import registration.registration;

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
      System.out.println("Some error " + e.getMessage());
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
    System.out.println("2. Edit doctor");
    System.out.println("3. Add doctor");
    System.out.println("4. Generate bill");
    System.out.println("5. Refund payment");
    System.out.println("");
    // System.out.println("5. Personal information");
  }
}

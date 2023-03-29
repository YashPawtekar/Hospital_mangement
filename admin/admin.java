package admin;
import java.util.*;
import login.*;

interface ad {
  public void adminStart();

  public void adminOption();
}

public class admin implements ad {
  login login = new login();

  public void adminStart() {
    System.out.println("1. Admin");
  }

  public void adminOption() {
    System.out.println("");
    System.out.println("Welcome to Admin Panel");
    System.out.println("*************************************");
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

    } else if (optionAdmin == 2) {
      login.userLogin("Admin");
    }
  }

}

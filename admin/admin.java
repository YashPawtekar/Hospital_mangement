package admin;
import java.util.*;

interface ad{
  public void adminStart();
  public void adminOption();
}


public class admin implements ad{
  public void adminStart(){
    System.out.println("1. Admin");
  }
  public void adminOption(){
    System.out.println("");
    System.out.println("Welcome to Admin Panel");
    System.out.println("*************************************");
    System.out.println("");
    System.out.println("1. Registration");
    System.out.println("2. Login");
    System.out.println("");

    Scanner scan3 = new Scanner(System.in);
    // int optionAdmin=1;
    try{
      int optionAdmin = scan3.nextInt();
    }catch(NoSuchElementException e){
      System.out.println("Some error " + e);
    }
    finally{
      scan3.close();
    }
   
    // System.out.println(optionAdmin);
  }
  
}

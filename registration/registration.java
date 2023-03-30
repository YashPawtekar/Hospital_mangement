package registration;
import java.util.*;
import admin.admin;
import doctor.doctor;
interface reg{
    public void registra(String section);
}

public class registration implements reg {
    admin admin = new admin();
    doctor doctor = new doctor();
   
    public void registra(String section){
        
        if(section == "Admin"){
            String[][] users = new String[10][5];
            int userCount = 0;
    
            String id= "UID"+ userCount; 
    
            System.out.println("Please enter full name");
            Scanner userfullName = new Scanner(System.in);
            String userfull = userfullName.next();
    
            System.out.println("Please enter email");
            Scanner userEmail = new Scanner(System.in);
            String Emailuser = userEmail.next();
    
            System.out.println("Please enter phone number");
            Scanner userPhoneNumber = new Scanner(System.in);
            String PhoneNumber = userPhoneNumber.next();
    
            System.out.println("Please enter password");
            Scanner userPassword = new Scanner(System.in);
            String Password = userPassword.next();
            
            users[userCount][0] = id;
            users[userCount][1] = userfull;
            users[userCount][2] = Emailuser;
            users[userCount][3] = PhoneNumber;
            users[userCount][4] = Password;
            // System.out.println(Arrays.toString(users[userCount]));
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Your personal information . . .");
            System.out.println(Arrays.toString(users[userCount]));
            System.out.println("*");
            userCount++;
          System.out.println("");
          System.out.println("*************************************");
          System.out.println("Registration successful . . . !");
          System.out.println("");
          System.out.println("*************************************");
          System.out.println("");
          admin.adminOptionMore();
        }else if(section == "Doctor"){
            String[][] users = new String[10][6];
            int userCount = 0;
    
            String id= "DR"+ userCount; 
    
            System.out.println("Please enter full name");
            Scanner userfullName = new Scanner(System.in);
            String userfull = userfullName.next();
            String userfullN = "Dr." + userfull;

            System.out.println("Please enter email");
            Scanner userEmail = new Scanner(System.in);
            String Emailuser = userEmail.next();
    
            System.out.println("Please enter phone number");
            Scanner userPhoneNumber = new Scanner(System.in);
            String PhoneNumber = userPhoneNumber.next();

            System.out.println("Please enter your fees amount");
            Scanner doctorFees = new Scanner(System.in);
            String doctorfeesA = doctorFees.next();
            String doctorfeesAmount ="Rs" + doctorfeesA ;
    
            System.out.println("Please enter password");
            Scanner userPassword = new Scanner(System.in);
            String Password = userPassword.next();
            
            users[userCount][0] = id;
            users[userCount][1] = userfullN;
            users[userCount][2] = Emailuser;
            users[userCount][3] = PhoneNumber;
            users[userCount][4] = doctorfeesAmount;
            users[userCount][5] = Password;
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Your personal information . . .");
            System.out.println("");
            System.out.println(Arrays.toString(users[userCount]));
            System.out.println("*************************************");
            userCount++;
          System.out.println("");
          System.out.println("*************************************");
          System.out.println("Registration successful . . . !");
          System.out.println("*************************************");
          System.out.println("");
          doctor.doctorOptionMore();
        }else if(section == "Patient"){
            String[][] users = new String[10][6];
            int userCount = 0;
    
            String id= "PT"+ userCount; 
    
            System.out.println("Please enter full name");
            Scanner userfullName = new Scanner(System.in);
            String userfull = userfullName.next();

            System.out.println("Please enter email");
            Scanner userEmail = new Scanner(System.in);
            String Emailuser = userEmail.next();
    
            System.out.println("Please enter phone number");
            Scanner userPhoneNumber = new Scanner(System.in);
            String PhoneNumber = userPhoneNumber.next();

            System.out.println("Please enter your blood group");
            Scanner bloodG = new Scanner(System.in);
            String bloodgroup = bloodG.next();
            String bloodGroupUser ="+" + bloodgroup ;
    
            System.out.println("Please enter password");
            Scanner userPassword = new Scanner(System.in);
            String Password = userPassword.next();
            
            users[userCount][0] = id;
            users[userCount][1] = userfull;
            users[userCount][2] = Emailuser;
            users[userCount][3] = PhoneNumber;
            users[userCount][4] = Password;
            users[userCount][5] = bloodGroupUser;
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Your personal information . . .");
            System.out.println("");
            System.out.println(Arrays.toString(users[userCount]));
            System.out.println("*************************************");
            userCount++;
          System.out.println("");
          System.out.println("*************************************");
          System.out.println("Registration successful . . . !");
          System.out.println("*************************************");
          System.out.println("");
          doctor.doctorOptionMore();
        }
        
    }
}

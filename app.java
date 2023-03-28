import admin.admin;
import doctor.doctor;
import patient.patient;

class startApp 
{
    void adminC(){
        admin ad=new admin();
        ad.adminStart();
    }
    void doctorC(){
        doctor doc= new doctor();
        doc.doctorStart();
    }
    void patientC(){
        patient pat= new patient();
        pat.patientStart();
    }
    void start(){
        adminC();
        doctorC();
        patientC();
    }

}


public class app{
    public static void main(String[] args){
        startApp startApp =new startApp();
        startApp.start();
    }

   
}
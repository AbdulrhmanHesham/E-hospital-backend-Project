package homeform;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class GUITest {


    @Test
    void checklogin() {
        System.out.println("Checklogin");
        String SSN = "";
        String Password = "";
        GUI instance = new GUI();
        instance.Checklogin(SSN, Password);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    @Test
    void checkReg() {
        System.out.println("CheckReg");
        String fname = "";
        String lname = "";
        String Gender = "";
        String Password = "";
        String SSN = "";
        String age = "";
        GUI instance = new GUI();
        instance.CheckReg(fname, lname, Gender, Password, SSN, age);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    @Test
    void checkAppointment() {
        System.out.println("CheckAppointment");
        String SSN = "";
        GUI instance = new GUI();
        instance.CheckAppointment(SSN);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }
}
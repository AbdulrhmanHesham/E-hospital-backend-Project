/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package homeform;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Abdul
 */
public class GUITest {
    
    public GUITest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class GUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Checklogin method, of class GUI.
     */
    @Test
    public void testChecklogin() {
        System.out.println("Checklogin");
        String SSN = "";
        String Password = "";
        GUI instance = new GUI();
        instance.Checklogin(SSN, Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckReg method, of class GUI.
     */
    @Test
    public void testCheckReg() {
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckAppointment method, of class GUI.
     */
    @Test
    public void testCheckAppointment() {
        System.out.println("CheckAppointment");
        String SSN = "";
        GUI instance = new GUI();
        instance.CheckAppointment(SSN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisiable method, of class GUI.
     */
    @Test
    public void testSetVisiable() {
        System.out.println("setVisiable");
        boolean b = false;
        GUI instance = new GUI();
        instance.setVisiable(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

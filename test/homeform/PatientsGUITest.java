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
public class PatientsGUITest {
    
    public PatientsGUITest() {
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
     * Test of main method, of class PatientsGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PatientsGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeAppointment method, of class PatientsGUI.
     */
    @Test
    public void testMakeAppointment() {
        System.out.println("MakeAppointment");
        String Patientname = "";
        String PatientSSN = "";
        String SelectedSpecialization = "";
        String AvailableDoc = "";
        String AvailableDate_time = "";
        PatientsGUI instance = new PatientsGUI();
        instance.MakeAppointment(Patientname, PatientSSN, SelectedSpecialization, AvailableDoc, AvailableDate_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectedSpecialization method, of class PatientsGUI.
     */
    @Test
    public void testSelectedSpecialization() {
        System.out.println("SelectedSpecialization");
        String SelectedSpecialization = "";
        PatientsGUI instance = new PatientsGUI();
        instance.SelectedSpecialization(SelectedSpecialization);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

package homeform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PatientsGUITest {

    @Test
    void makeAppointment() {
        System.out.println("MakeAppointment");
        String Patientname = "";
        String PatientSSN = "";
        String SelectedSpecialization = "";
        String AvailableDoc = "";
        String AvailableDate_time = "";
        PatientsGUI instance = new PatientsGUI();
        instance.MakeAppointment(Patientname, PatientSSN, SelectedSpecialization, AvailableDoc, AvailableDate_time);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    @Test
    void selectedSpecialization() {
        System.out.println("SelectedSpecialization");
        String SelectedSpecialization = "";
        PatientsGUI instance = new PatientsGUI();
        instance.SelectedSpecialization(SelectedSpecialization);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
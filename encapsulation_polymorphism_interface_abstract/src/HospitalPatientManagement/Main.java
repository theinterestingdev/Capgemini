package HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("P-100", "Rita", 45, 4, 2000));
        patients.add(new OutPatient("P-200", "Sam", 32, 500, 1200));

        for (Patient patient : patients) {
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Checked vitals");
                record.addRecord("Prescribed meds");
                System.out.println("Records: " + record.viewRecords());
            }
            System.out.println("Bill: " + patient.calculateBill());
            System.out.println("---");
        }
    }
}

package HospitalPatientManagement;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;

    public OutPatient(String patientId, String name, int age, double consultationFee, double testCharges) {
        super(patientId, name, age);
        setConsultationFee(consultationFee);
        setTestCharges(testCharges);
    }

    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        }
    }

    public void setTestCharges(double testCharges) {
        if (testCharges >= 0) {
            this.testCharges = testCharges;
        }
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String note) {
        addHistory(note);
    }

    @Override
    public String viewRecords() {
        return getHistory();
    }
}

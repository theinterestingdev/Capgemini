package HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        setDaysAdmitted(daysAdmitted);
        setDailyRate(dailyRate);
    }

    public void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted >= 0) {
            this.daysAdmitted = daysAdmitted;
        }
    }

    public void setDailyRate(double dailyRate) {
        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        }
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
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

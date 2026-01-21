package HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private final String patientId;
    private String name;
    private int age;
    private List<String> history = new ArrayList<>();

    protected Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        setName(name);
        setAge(age);
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    protected void addHistory(String note) {
        if (note != null && !note.isBlank()) {
            history.add(note);
        }
    }

    protected String getHistory() {
        return String.join(" | ", history);
    }

    public void getPatientDetails() {
        System.out.println("Patient: " + patientId + " " + name + " Age: " + age);
    }

    public abstract double calculateBill();
}

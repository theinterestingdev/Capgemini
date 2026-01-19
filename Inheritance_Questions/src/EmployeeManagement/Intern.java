package EmployeeManagement;

public class Intern extends Employee {
    private String mentorName;
    private int durationMonths;

    public Intern(String name, int id, double salary, String mentorName, int durationMonths) {
        super(name, id, salary);
        this.mentorName = mentorName;
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Mentor: " + mentorName);
        System.out.println("Duration: " + durationMonths + " months");
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
}

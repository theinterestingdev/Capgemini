package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 101, 80000, 10);
        Developer developer = new Developer("Jane Smith", 102, 70000, "Java");
        Intern intern = new Intern("Bob Wilson", 103, 30000, "John Doe", 6);

        System.out.println("=== Employee Details ===");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}

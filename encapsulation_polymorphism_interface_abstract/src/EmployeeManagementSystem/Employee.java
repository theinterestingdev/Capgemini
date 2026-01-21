package EmployeeManagementSystem;

abstract class Employee {

    private final int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        setName(name);
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + calculateSalary());
    }
}

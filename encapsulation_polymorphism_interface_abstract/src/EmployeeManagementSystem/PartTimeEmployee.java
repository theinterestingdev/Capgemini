package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {

    private String department;
    private double hoursWorked;

    public PartTimeEmployee(int employeeId,String name,double baseSalary,double hoursWorked)
    {
        super(employeeId,name,baseSalary);
        setHoursWorked(hoursWorked);
    }





    public double calculateSalary()
    {
        return getBaseSalary() * hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    @Override
    public void assignDepartment(String deptName) {
        if (deptName != null && !deptName.isBlank()) {
            this.department = deptName;
        }
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

}

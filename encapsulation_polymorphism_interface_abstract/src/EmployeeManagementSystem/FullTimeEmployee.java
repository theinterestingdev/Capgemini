package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee implements Department {


    private String department;

    public FullTimeEmployee(int employeeId,String name,double baseSalary)
    {
        super(employeeId,name,baseSalary);
    }

    @Override
    public double calculateSalary()
    {
        return getBaseSalary();
    }


    @Override
    public void assignDepartment(String department)
    {
        if (department != null && !department.isBlank()) {
            this.department = department;
        }
    }

    @Override
    public String getDepartmentDetails()
    {
        return department;
    }



}

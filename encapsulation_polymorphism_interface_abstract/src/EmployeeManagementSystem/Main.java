package EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(8238, "Alice", 89000);
        Employee e2 = new PartTimeEmployee(1238, "Karon", 8000, 12);

        if (e1 instanceof Department) {
            Department d1 = (Department) e1;
            d1.assignDepartment("IT");
        }

        if (e2 instanceof Department) {
            Department d2 = (Department) e2;
            d2.assignDepartment("HR");
        }


        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println("Department: " + dept.getDepartmentDetails());
            }
            System.out.println("----------------------------");
        }



    }

}

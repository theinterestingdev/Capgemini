package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EmployeeMain 
{
    public static void main(String[] args) 
    {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John Doe", "Engineering", 90000),
            new Employee(2, "Jane Smith", "Engineering", 85000),
            new Employee(3, "Mike Johnson", "Marketing", 75000),
            new Employee(4, "Sarah Williams", "Engineering", 95000),
            new Employee(5, "Tom Brown", "Engineering", 70000),
            new Employee(6, "Emily Davis", "HR", 65000),
            new Employee(7, "Chris Wilson", "Engineering", 88000)
        );
        
        EmployeeProcessor processor = new EmployeeProcessor();
        Map<String, Double> result = processor.processEmployees(employees);
        
        System.out.println("Average salary by department:");
        result.forEach((dept, avg) -> System.out.println(dept + ": $" + String.format("%.2f", avg)));
    }
}

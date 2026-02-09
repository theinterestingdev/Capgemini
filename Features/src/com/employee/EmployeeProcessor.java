package com.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcessor 
{
    public Map<String, Double> processEmployees(List<Employee> employees) 
    {
        Map<String, List<Employee>> grouped = employees.stream()
            .filter(e -> "Engineering".equals(e.getDepartment()) && e.getSalary() > 80000)
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .collect(Collectors.groupingBy(Employee::getDepartment));
        
        Map<String, Double> averageSalaries = new HashMap<>();
        grouped.forEach((dept, empList) -> 
        {
            double avg = empList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
            averageSalaries.put(dept, avg);
        });
        
        return averageSalaries;
    }
}

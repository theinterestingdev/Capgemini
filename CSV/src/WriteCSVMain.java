import java.util.ArrayList;
import java.util.List;

public class WriteCSVMain 
{
    public static void main(String[] args) 
    {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(101, "Alice Johnson", "HR", 55000));
        employees.add(new Employee(102, "Bob Smith", "IT", 75000));
        employees.add(new Employee(103, "Carol White", "Finance", 65000));
        employees.add(new Employee(104, "David Brown", "IT", 80000));
        employees.add(new Employee(105, "Eve Davis", "Marketing", 60000));
        employees.add(new Employee(106, "Frank Miller", "IT", 85000));
        
        CSVWriter writer = new CSVWriter();
        List<String[]> csvData = new ArrayList<>();
        
        csvData.add(new String[]{"ID", "Name", "Department", "Salary"});
        
        for (Employee emp : employees) 
        {
            String[] row = {
                String.valueOf(emp.getId()),
                emp.getName(),
                emp.getDepartment(),
                String.valueOf(emp.getSalary())
            };
            csvData.add(row);
        }
        
        writer.writeCSV("employees.csv", csvData);
        
        System.out.println("Employee data written to employees.csv");
        System.out.println("Total records written: " + (employees.size()));
        
        for (Employee emp : employees) 
        {
            System.out.println(emp);
        }
    }
}

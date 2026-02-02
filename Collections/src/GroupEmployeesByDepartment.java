import java.util.*;

public class GroupEmployeesByDepartment {
    static class Employee { String name; String dept; Employee(String n,String d){name=n;dept=d;} public String toString(){return name;} }
    public static Map<String,List<Employee>> group(List<Employee> es){
        Map<String,List<Employee>> m=new HashMap<>();
        for(Employee e: es) m.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e);
        return m;
    }
    public static void main(String[] args){
        List<Employee> es=Arrays.asList(new Employee("Alice","HR"),new Employee("Bob","IT"),new Employee("Carol","HR"));
        System.out.println(group(es));
    }
}

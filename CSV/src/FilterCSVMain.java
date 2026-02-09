import java.util.ArrayList;
import java.util.List;

public class FilterCSVMain 
{
    public static void main(String[] args) 
    {
        CSVReader reader = new CSVReader();
        List<String[]> records = reader.readCSV("students.csv");
        
        List<Student> highScorers = new ArrayList<>();
        
        for (int i = 0; i < records.size(); i++) 
        {
            String[] record = records.get(i);
            if (i == 0) continue;
            
            try 
            {
                int id = Integer.parseInt(record[0]);
                String name = record[1];
                int age = Integer.parseInt(record[2]);
                int marks = Integer.parseInt(record[3]);
                
                Student student = new Student(id, name, age, marks);
                
                if (marks > 80) 
                {
                    highScorers.add(student);
                }
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Invalid data format in record: " + String.join(",", record));
            }
        }
        
        System.out.println("Students with marks > 80:");
        System.out.println("ID\tName\tAge\tMarks");
        System.out.println("--------------------------------");
        
        for (Student student : highScorers) 
        {
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + 
                             student.getAge() + "\t" + student.getMarks());
        }
        
        System.out.println("\nTotal qualifying students: " + highScorers.size());
    }
}

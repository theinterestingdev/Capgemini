import java.util.List;

public class ReadCSVMain 
{
    public static void main(String[] args) 
    {
        CSVReader reader = new CSVReader();
        List<String[]> records = reader.readCSV("students.csv");
        
        System.out.println("Student Records:");
        System.out.println("ID\tName\tAge\tMarks");
        System.out.println("--------------------------------");
        
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
                System.out.println(id + "\t" + name + "\t" + age + "\t" + marks);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Invalid data format in record: " + String.join(",", record));
            }
        }
    }
}

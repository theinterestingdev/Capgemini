import java.util.List;

public class CountCSVMain 
{
    public static void main(String[] args) 
    {
        CSVReader reader = new CSVReader();
        List<String[]> records = reader.readCSV("students.csv");
        
        int totalRows = records.size();
        int dataRows = totalRows - 1;
        
        System.out.println("CSV File Analysis:");
        System.out.println("Total rows including header: " + totalRows);
        System.out.println("Data rows (excluding header): " + dataRows);
        
        if (totalRows > 0) 
        {
            String[] headers = records.get(0);
            System.out.println("Number of columns: " + headers.length);
            System.out.println("Column headers: " + String.join(", ", headers));
        }
        
        System.out.println("\nRecord count: " + dataRows + " student records found");
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter 
{
    public void writeCSV(String filePath, List<String[]> data) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) 
        {
            for (String[] row : data) 
            {
                String line = String.join(",", row);
                bw.write(line);
                bw.newLine();
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing CSV file: " + e.getMessage());
        }
    }
}

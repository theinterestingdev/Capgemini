import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {
    public static void main(String[] args) {
        String path = "info.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            if (line != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

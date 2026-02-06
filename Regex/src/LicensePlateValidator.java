import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter license plate:");
        String plate = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
        
        if (pattern.matcher(plate).matches()) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
        }
        
        scanner.close();
    }
}

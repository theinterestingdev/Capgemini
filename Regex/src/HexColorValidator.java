import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hex color:");
        String color = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");
        
        if (pattern.matcher(color).matches()) {
            System.out.println("Valid hex color");
        } else {
            System.out.println("Invalid hex color");
        }
        
        scanner.close();
    }
}

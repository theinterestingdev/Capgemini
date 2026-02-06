import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
        
        if (pattern.matcher(username).matches()) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
        
        scanner.close();
    }
}

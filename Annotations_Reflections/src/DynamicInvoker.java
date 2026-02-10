import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations math = new MathOperations();
        
        System.out.print("Enter method name (add/subtract/multiply/divide): ");
        String methodName = scanner.nextLine();
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        try {
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
            Object result = method.invoke(math, a, b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}

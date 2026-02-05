import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int r = a / b;
            System.out.println("Result: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}

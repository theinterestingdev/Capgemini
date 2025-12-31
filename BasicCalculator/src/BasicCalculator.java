import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);



        if (number2 != 0) {
            division = number1 / number2;
            System.out.println("Division = " + division);
        } else {
            System.out.println("Division = Not possible (division by zero)");
            return;
        }

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+addition+" "+subtraction+" "+multiplication+" "+division);
    }
}

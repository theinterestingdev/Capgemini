import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(originalNumber % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
        input.close();
    }
}

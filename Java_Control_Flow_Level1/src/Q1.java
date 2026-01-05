import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean result = number % 5 == 0;

        System.out.println("Is the number " + number + " divisible by 5? " + result);

        input.close();
    }
}

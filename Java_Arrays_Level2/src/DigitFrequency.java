import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        int temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        int[] digits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}

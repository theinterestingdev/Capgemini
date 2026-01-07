import java.util.Scanner;

public class NumberCheckerVariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);

        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, sumDigits);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Digit count: " + digitCount);
        System.out.println("Sum of digits: " + sumDigits);
        System.out.println("Sum of squares: " + sumSquares);
        System.out.println("Is Harshad number: " + isHarshad);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }

        scanner.close();
    }

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number, int digitCount) {
        number = Math.abs(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }
        return sum;
    }


    public static boolean isHarshadNumber(int number, int sumDigits) {
        number = Math.abs(number);
        if (sumDigits == 0) return false;
        return number % sumDigits == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}
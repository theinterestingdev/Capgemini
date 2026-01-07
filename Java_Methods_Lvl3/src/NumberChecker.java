import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);

        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits, digitCount);
        int[] largestTwo = findLargestAndSecondLargest(digits);
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);

        System.out.println("Digit count: " + digitCount);
        System.out.println("Is duck number: " + isDuck);
        System.out.println("Is Armstrong number: " + isArmstrong);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second largest: " + largestTwo[1]);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second smallest: " + smallestTwo[1]);

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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int originalNumber, int[] digits, int digitCount) {
        int number = Math.abs(originalNumber);
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, digitCount);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
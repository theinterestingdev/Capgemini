import java.util.Scanner;

public class NumberAnalyzer {

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int a, int b) {
        if (a > b)
        {
            return 1;
        }
        else if (a == b)
        {
            return 0;
        }
        else
        {
            return -1;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }

            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}

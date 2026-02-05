import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size (-1 for null): ");
            int n = sc.nextInt();
            int[] arr;
            if (n == -1) {
                arr = null;
            } else {
                arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            }
            System.out.print("Enter index: ");
            int idx = sc.nextInt();
            try {
                int val = arr[idx];
                System.out.println("Value at index " + idx + ": " + val);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
        } finally {
            sc.close();
        }
    }
}

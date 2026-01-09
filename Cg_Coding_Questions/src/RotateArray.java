import java.util.Scanner;

public class RotateArray {

    public static void rotateLeft(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;

        for(int rotation = 0; rotation < k; rotation++)
        {
            int temp = arr[0];
            for(int i = 0; i < n - 1; i++)
            {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void rotateRight(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;

        for(int rotation = 0; rotation < k; rotation++)
        {
            int temp = arr[n - 1];
            for(int i = n - 1; i > 0; i--)
            {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }



        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();


            rotateLeft(arr, k);
            rotateRight(arr, k);


        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

}

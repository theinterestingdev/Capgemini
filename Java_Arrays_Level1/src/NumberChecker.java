import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = input.nextInt();

            if(arr[i]==0)
            {
                System.out.println("Zero");
            }
            else if(arr[i]<0)
            {
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Positive");
                if(arr[i]%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
        }

        if(arr[0]==arr[arr.length-1])
        {
            System.out.println("Equal");
        }
        else if(arr[0]>arr[arr.length-1])
        {
            System.out.println("First element is Greater");
        }
        else
        {
            System.out.println("Last element is Greater");
        }

        input.close();

    }
}

import java.util.Scanner;

public class DigitsInReverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int digitCount = 0;
        int temp = number;

        while(temp > 0)
        {
            temp = temp/10;
            digitCount++;
        }
        int [] arr = new int[digitCount];
        int index = 0;

        while(number>0)
        {
            arr[index] = number%10;
            number = number/10;
            index++;
        }

        for(int digit : arr)
        {
            System.out.print(digit + " ");
        }

    }



}

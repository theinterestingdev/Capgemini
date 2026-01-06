import java.util.Scanner;

public class AgeAndHeight {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        int youngestIndex = 0;
        int youngestAge = age[0];
        int tallestIndex = 0;
        int tallestHeight = height[0];

        for(int i = 0;i<age.length;i++)
        {
            age[i] = input.nextInt();
            height[i] = input.nextInt();

            if(youngestAge>age[i])
            {
                youngestAge = age[i];
                youngestIndex = i;
            }

            if(tallestHeight<height[i])
            {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }

        System.out.println("The youngest among the three is " + (youngestIndex+1) + " and the tallest of the three friends is "+tallestIndex);
    }

}

import java.util.Scanner;

public class LengthOfString {

    public static int lengthOfStringUsingCharAt(String text)
    {

        int count = 0;
        try {
            int idx = 0;

            while (true) {
                text.charAt(idx);
                count++;
                idx++;
            }
        }
        catch(StringIndexOutOfBoundsException e) {
            return count;
        }
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int lengthCharAt = lengthOfStringUsingCharAt(text);
        int lengthUsingMethod = text.length();

        System.out.println(lengthCharAt);
        System.out.println(lengthUsingMethod);
        input.close();
    }

}

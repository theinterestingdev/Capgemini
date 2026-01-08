import java.util.Scanner;

public class CharactersInString {

    public static String stringUsingCharAt(String a)
    {
        String res = "";

        for(int i = 0;i<a.length();i++)
        {
            res += a.charAt(i);
        }

        return res;
    }

    public static String stringUsingToCharArray(String a)
    {
        String res = "";

        for(char i : a.toCharArray())
        {
            res += i;
        }

        return res;
    }

    public static boolean compare2Strings(String a,String b)
    {
        return a.equals(b);
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();

        String stringUsingCharAtMethod = stringUsingCharAt(a);
        String stringUsingToCharArrayMethod = stringUsingToCharArray(a);

        System.out.println(compare2Strings(stringUsingCharAtMethod,stringUsingToCharArrayMethod));

    }
}



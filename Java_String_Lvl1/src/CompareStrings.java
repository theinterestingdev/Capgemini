import java.util.Scanner;

public class CompareStrings {


    public static boolean usingCharAt(String a,String b)
    {
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean usingEquals(String a,String b)
    {
        return a.equals(b);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        if(a.length()!=b.length())
        {
            System.out.println("Strings not equal [Length]");
            return;
        }

        if((usingCharAt(a,b))==false)
        {
            System.out.println("Strings are not equal [UsingCharAt]");
        }
        else
        {
            System.out.println("Strings are equal [UsingCharAt]");
        }
        if(usingEquals(a,b))
        {
            System.out.println("Strings are equal [Using Equals]");
        }
        else
        {
            System.out.println("Strings are not equal [Using Equals]");
        }


    }


}

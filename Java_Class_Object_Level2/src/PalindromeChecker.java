import java.util.*;

public class PalindromeChecker {

    String text;


    public PalindromeChecker(String text)
    {
        this.text = text;
    }

    public boolean checkIfPalindrome()
    {
        StringBuilder rev = new StringBuilder(text);

        if(text.equals(rev.reverse().toString()))
        {
            return true;
        }

        return false;
    }

    public void displayResult()
    {
        if(checkIfPalindrome())
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker palindromeChecker = new PalindromeChecker("AMAM");
        palindromeChecker.displayResult();

    }


}

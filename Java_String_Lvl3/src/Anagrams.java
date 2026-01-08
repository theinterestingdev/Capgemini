import java.util.Scanner;

public class Anagrams {

    public static boolean isAnagram(String text1,String text2)
    {
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];


        if(text1.length()!=text2.length()){
            return false;
        }

        for(int i =0 ;i<text1.length();i++)
        {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for(int i = 0;i<text1.length();i++)
        {
            if(freq1[text1.charAt(i)]!=freq2[text2.charAt(i)])
            {
                return false;
            }
        }

        return true;


    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text1 = input.nextLine();
        String text2 = input.nextLine();

        System.out.println(isAnagram(text1,text2));


    }

}

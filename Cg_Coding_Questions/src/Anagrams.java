import java.util.*;

public class Anagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.length()!=b.length())
        {
            System.out.println("Length not equal");
        }

        HashMap<Character,Integer>mp1 = new HashMap<>();
        HashMap<Character,Integer>mp2 = new HashMap<>();

        for(char i : a.toCharArray())
        {
            mp1.put(i,mp1.getOrDefault(i,0)+1);
        }
        for(char i : b.toCharArray())
        {
            mp2.put(i,mp2.getOrDefault(i,0)+1);
        }

        if(mp1.equals(mp2))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }

    }
}

import java.util.*;
public class DuplicateElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer>mp = new HashMap<>();

        int n  = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();

            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        System.out.println("Duplicate Elements : ");

        for(var i : mp.entrySet())
        {
            if(i.getValue()>1)
            {
                System.out.print(i.getKey() + " ");
            }
        }



    }

}

public class CountingSortStudentAges
{
    public static void sort(int[] a)
    {
        if (a == null || a.length == 0)
        {
            return;
        }

        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int[] count = new int[range];

        for (int v : a)
        {
            count[v - min]++;
        }

        for (int i = 1; i < range; i++)
        {
            count[i] += count[i - 1];
        }

        int[] out = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--)
        {
            int v = a[i];
            out[--count[v - min]] = v;
        }

        for (int i = 0; i < a.length; i++)
        {
            a[i] = out[i];
        }
    }

    public static void main(String[] args)
    {
        int[] ages = new int[]
        {
            12,
            17,
            10,
            14,
            18,
            13,
            16,
            11,
            15
        };

        sort(ages);

        System.out.println(java.util.Arrays.toString(ages));
    }
}

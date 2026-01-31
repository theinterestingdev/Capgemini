public class BubbleSortMarks
{
    public static void sort(int[] a)
    {
        int n = a.length;
        boolean swapped;

        do
        {
            swapped = false;

            for (int i = 1; i < n; i++)
            {
                if (a[i - 1] > a[i])
                {
                    int t = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = t;
                    swapped = true;
                }
            }

            n--;
        }
        while (swapped);
    }

    public static void main(String[] args)
    {
        int[] marks = new int[]
        {
            78,
            92,
            67,
            85,
            90,
            73
        };

        sort(marks);

        System.out.println(java.util.Arrays.toString(marks));
    }
}

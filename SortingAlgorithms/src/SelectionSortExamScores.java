public class SelectionSortExamScores
{
    public static void sort(int[] a)
    {
        int n = a.length;

        for (int i = 0; i < n - 1; i++)
        {
            int minIdx = i;

            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[minIdx])
                {
                    minIdx = j;
                }
            }

            int t = a[i];
            a[i] = a[minIdx];
            a[minIdx] = t;
        }
    }

    public static void main(String[] args)
    {
        int[] scores = new int[]
        {
            56,
            78,
            45,
            89,
            67,
            92
        };

        sort(scores);

        System.out.println(java.util.Arrays.toString(scores));
    }
}

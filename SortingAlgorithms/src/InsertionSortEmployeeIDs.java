public class InsertionSortEmployeeIDs
{
    public static void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    public static void main(String[] args)
    {
        int[] empIds = new int[]
        {
            104,
            102,
            110,
            101,
            109,
            108
        };

        sort(empIds);

        System.out.println(java.util.Arrays.toString(empIds));
    }
}

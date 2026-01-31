public class MergeSortBookPrices
{
    public static void sort(int[] a)
    {
        if (a == null || a.length < 2)
        {
            return;
        }

        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int l, int r)
    {
        if (l >= r)
        {
            return;
        }

        int m = l + (r - l) / 2;

        sort(a, l, m);
        sort(a, m + 1, r);

        merge(a, l, m, r);
    }

    private static void merge(int[] a, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            L[i] = a[l + i];
        }

        for (int j = 0; j < n2; j++)
        {
            R[j] = a[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                a[k] = L[i];
                k++;
                i++;
            }
            else
            {
                a[k] = R[j];
                k++;
                j++;
            }
        }

        while (i < n1)
        {
            a[k] = L[i];
            k++;
            i++;
        }

        while (j < n2)
        {
            a[k] = R[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args)
    {
        int[] prices = new int[] { 499, 199, 799, 299, 599, 399 };

        sort(prices);

        System.out.println(java.util.Arrays.toString(prices));
    }
}

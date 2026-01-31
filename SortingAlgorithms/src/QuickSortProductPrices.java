public class QuickSortProductPrices
{
    public static void sort(int[] a)
    {
        if (a == null || a.length < 2)
        {
            return;
        }

        quick(a, 0, a.length - 1);
    }

    private static void quick(int[] a, int l, int r)
    {
        if (l >= r)
        {
            return;
        }

        int p = partition(a, l, r);

        quick(a, l, p - 1);
        quick(a, p + 1, r);
    }

    private static int partition(int[] a, int l, int r)
    {
        int pivot = a[r];
        int i = l - 1;

        for (int j = l; j < r; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[r];
        a[r] = t;

        return i + 1;
    }

    public static void main(String[] args)
    {
        int[] productPrices = new int[]
        {
            1299,
            999,
            1499,
            799,
            1199,
            899
        };

        sort(productPrices);

        System.out.println(java.util.Arrays.toString(productPrices));
    }
}

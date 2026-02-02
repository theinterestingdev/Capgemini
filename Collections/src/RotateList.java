import java.util.*;

public class RotateList {
    public static void rotate(List<Integer> list, int k) {
        int n = list.size();
        if (n == 0) return;
        k = ((k % n) + n) % n;
        reverse(list, 0, n - 1);
        reverse(list, 0, n - k - 1);
        reverse(list, n - k, n - 1);
    }

    static void reverse(List<Integer> list, int i, int j) {
        while (i < j) {
            Integer t = list.get(i);
            list.set(i, list.get(j));
            list.set(j, t);
            i++; j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotate(a, 2);
        System.out.println(a);
    }
}

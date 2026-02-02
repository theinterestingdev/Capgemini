import java.util.*;

public class ReverseListArrayAndLinked {
    static void reverseList(List<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseList(a);
        reverseList(l);
        System.out.println(a);
        System.out.println(l);
    }
}

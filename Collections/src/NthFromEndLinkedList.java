import java.util.*;

public class NthFromEndLinkedList {
    public static String nthFromEnd(LinkedList<String> list, int n) {
        if (n <= 0) throw new IllegalArgumentException();
        ListIterator<String> p1 = list.listIterator();
        ListIterator<String> p2 = list.listIterator();
        for (int i = 0; i < n; i++) {
            if (!p2.hasNext()) throw new IllegalArgumentException();
            p2.next();
        }
        while (p2.hasNext()) {
            p1.next();
            p2.next();
        }
        return p1.next();
    }

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(nthFromEnd(l, 2));
    }
}

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(5,3,9,1));
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        System.out.println(l);
    }
}

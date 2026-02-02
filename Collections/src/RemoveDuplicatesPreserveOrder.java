import java.util.*;

public class RemoveDuplicatesPreserveOrder {
    public static List<Integer> dedup(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        for (Integer x : list) {
            if (seen.add(x)) {
                out.add(x);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3,1,2,2,3,4);
        System.out.println(dedup(a));
    }
}

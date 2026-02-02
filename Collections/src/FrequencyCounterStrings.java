import java.util.*;

public class FrequencyCounterStrings {
    public static Map<String,Integer> frequency(List<String> items) {
        Map<String,Integer> m = new HashMap<>();
        for (String s : items) m.put(s, m.getOrDefault(s, 0) + 1);
        return m;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple","banana","apple","orange");
        System.out.println(frequency(input));
    }
}

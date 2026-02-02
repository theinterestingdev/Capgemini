import java.time.*;
import java.util.*;

public class PolicySetManager {
    static class Policy {
        String number;
        String holder;
        LocalDate expiry;
        String type;
        double premium;
        Policy(String number, String holder, LocalDate expiry, String type, double premium) {
            this.number = number;
            this.holder = holder;
            this.expiry = expiry;
            this.type = type;
            this.premium = premium;
        }
        public String toString() {
            return number + " " + holder + " " + expiry + " " + type + " " + premium;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Policy)) return false;
            Policy p = (Policy) o;
            return number.equals(p.number);
        }
        public int hashCode() {
            return number.hashCode();
        }
    }

    static Set<Policy> sample(HashSet<Policy> hs, LinkedHashSet<Policy> lhs, TreeSet<Policy> ts) {
        List<Policy> list = Arrays.asList(
            new Policy("P1", "A", LocalDate.now().plusDays(10), "Health", 1000),
            new Policy("P2", "B", LocalDate.now().plusDays(40), "Auto", 1200),
            new Policy("P3", "A", LocalDate.now().plusDays(25), "Home", 900),
            new Policy("P1", "A", LocalDate.now().plusDays(10), "Health", 1000)
        );
        hs.addAll(list);
        lhs.addAll(list);
        ts.addAll(list);
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        HashSet<Policy> hs = new HashSet<>();
        LinkedHashSet<Policy> lhs = new LinkedHashSet<>();
        TreeSet<Policy> ts = new TreeSet<>(Comparator.comparing(p -> p.expiry));
        sample(hs, lhs, ts);
        System.out.println(hs.size());
        System.out.println(new ArrayList<>(lhs));
        System.out.println(new ArrayList<>(ts));
        LocalDate soon = LocalDate.now().plusDays(30);
        List<Policy> expSoon = new ArrayList<>();
        for (Policy p : hs) {
            if (!p.expiry.isAfter(soon)) {
                expSoon.add(p);
            }
        }
        System.out.println(expSoon);
        List<Policy> health = new ArrayList<>();
        for (Policy p : hs) {
            if (p.type.equals("Health")) {
                health.add(p);
            }
        }
        System.out.println(health);
        Map<String, Integer> counts = new HashMap<>();
        List<Policy> allAgain = new ArrayList<>(sample(new HashSet<>(), new LinkedHashSet<>(), new TreeSet<>(Comparator.comparing(x -> x.expiry))));
        for (Policy p : allAgain) {
            counts.put(p.number, counts.getOrDefault(p.number, 0) + 1);
        }
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() > 1) {
                duplicates.add(e.getKey());
            }
        }
        System.out.println(duplicates);
        int n = 20000;
        List<Policy> big = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            big.add(new Policy("X" + i, "H", LocalDate.now().plusDays(i % 365), "Auto", i));
        }
        long t1 = System.nanoTime();
        Set<Policy> s1 = new HashSet<>(big);
        long t2 = System.nanoTime();
        boolean f1 = s1.contains(big.get(n / 2));
        long t3 = System.nanoTime();
        s1.remove(big.get(n / 3));
        long t4 = System.nanoTime();
        LinkedHashSet<Policy> s2 = new LinkedHashSet<>(big);
        long t5 = System.nanoTime();
        boolean f2 = s2.contains(big.get(n / 2));
        long t6 = System.nanoTime();
        s2.remove(big.get(n / 3));
        long t7 = System.nanoTime();
        TreeSet<Policy> s3 = new TreeSet<>(Comparator.comparing(p -> p.expiry));
        s3.addAll(big);
        long t8 = System.nanoTime();
        boolean f3 = s3.contains(big.get(n / 2));
        long t9 = System.nanoTime();
        s3.remove(big.get(n / 3));
        long t10 = System.nanoTime();
        System.out.println("HashSet add/contains/remove ns: " + (t2 - t1) + " " + (t3 - t2) + " " + (t4 - t3));
        System.out.println("LinkedHashSet add/contains/remove ns: " + (t5 - t4) + " " + (t6 - t5) + " " + (t7 - t6));
        System.out.println("TreeSet add/contains/remove ns: " + (t8 - t7) + " " + (t9 - t8) + " " + (t10 - t9));
    }
}

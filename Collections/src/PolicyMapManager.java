import java.time.*;
import java.util.*;

public class PolicyMapManager {
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
    }

    public static void main(String[] args) {
        Map<String, Policy> hash = new HashMap<>();
        Map<String, Policy> linked = new LinkedHashMap<>();
        Comparator<String> byExpiry = Comparator.comparing(k -> linked.get(k).expiry);
        Map<String, Policy> tree = new TreeMap<>(byExpiry);
        List<Policy> list = Arrays.asList(
            new Policy("P1", "A", LocalDate.now().plusDays(10), "Health", 1000),
            new Policy("P2", "B", LocalDate.now().plusDays(40), "Auto", 1200),
            new Policy("P3", "A", LocalDate.now().plusDays(25), "Home", 900)
        );
        for (Policy p : list) {
            hash.put(p.number, p);
            linked.put(p.number, p);
        }
        tree.putAll(linked);
        System.out.println(hash.get("P2"));
        LocalDate soon = LocalDate.now().plusDays(30);
        List<Policy> expSoon = new ArrayList<>();
        for (Policy p : hash.values()) {
            if (!p.expiry.isAfter(soon)) {
                expSoon.add(p);
            }
        }
        System.out.println(expSoon);
        String targetHolder = "A";
        List<Policy> holderList = new ArrayList<>();
        for (Policy p : hash.values()) {
            if (p.holder.equals(targetHolder)) {
                holderList.add(p);
            }
        }
        System.out.println(holderList);
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = hash.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().expiry.isAfter(today)) {
                it.remove();
            }
        }
        System.out.println(new ArrayList<>(tree.values()));
    }
}

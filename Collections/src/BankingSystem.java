import java.util.*;

public class BankingSystem {
    public static void main(String[] args){
        Map<String,Integer> accounts = new HashMap<>();
        accounts.put("A1",1000); accounts.put("A2",500); accounts.put("A3",1500);
        TreeMap<Integer,List<String>> byBalance = new TreeMap<>();
        for(Map.Entry<String,Integer> e: accounts.entrySet()) byBalance.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
        Queue<String> withdrawals = new ArrayDeque<>();
        withdrawals.add("A2"); withdrawals.add("A1"); withdrawals.add("A3");
        while(!withdrawals.isEmpty()){
            String acc = withdrawals.remove();
            accounts.put(acc, accounts.getOrDefault(acc,0) - 100);
        }
        System.out.println(accounts);
        System.out.println(byBalance);
    }
}

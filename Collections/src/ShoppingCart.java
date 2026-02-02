import java.util.*;

public class ShoppingCart {
    static class Item { String name; int price; Item(String n,int p){name=n;price=p;} }
    public static void main(String[] args){
        Map<String,Integer> prices = new HashMap<>();
        prices.put("Apple",50); prices.put("Banana",20); prices.put("Milk",40);
        LinkedHashMap<String,Integer> cart = new LinkedHashMap<>();
        cart.put("Apple",2); cart.put("Milk",1); cart.put("Banana",3);
        TreeMap<Integer,List<String>> byPrice = new TreeMap<>();
        for(String name: prices.keySet()) byPrice.computeIfAbsent(prices.get(name),k->new ArrayList<>()).add(name);
        System.out.println(cart);
        List<String> sortedItems = new ArrayList<>();
        for(Map.Entry<Integer,List<String>> e: byPrice.entrySet()) for(String n: e.getValue()) sortedItems.add(n);
        System.out.println(sortedItems);
    }
}

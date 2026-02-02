import java.util.*;

public class MergeTwoMaps {
    public static Map<String,Integer> merge(Map<String,Integer> a, Map<String,Integer> b){
        Map<String,Integer> r=new HashMap<>(a);
        for(Map.Entry<String,Integer> e:b.entrySet()) r.put(e.getKey(), r.getOrDefault(e.getKey(),0)+e.getValue());
        return r;
    }
    public static void main(String[] args){
        Map<String,Integer> a=new HashMap<>(), b=new HashMap<>();
        a.put("A",1); a.put("B",2);
        b.put("B",3); b.put("C",4);
        System.out.println(merge(a,b));
    }
}

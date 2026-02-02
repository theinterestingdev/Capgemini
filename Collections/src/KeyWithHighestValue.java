import java.util.*;

public class KeyWithHighestValue {
    public static String maxKey(Map<String,Integer> m){
        String k=null; int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> e: m.entrySet()) if(e.getValue()>max){max=e.getValue();k=e.getKey();}
        return k;
    }
    public static void main(String[] args){
        Map<String,Integer> m=new HashMap<>();
        m.put("A",10); m.put("B",20); m.put("C",15);
        System.out.println(maxKey(m));
    }
}

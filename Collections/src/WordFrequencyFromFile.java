import java.util.*;
import java.nio.file.*;

public class WordFrequencyFromFile {
    static Map<String,Integer> countWords(String text){
        Map<String,Integer> m=new HashMap<>();
        String[] w=text.toLowerCase().replaceAll("[^a-z0-9\n ]"," ").split("\\s+");
        for(String s:w) if(!s.isEmpty()) m.put(s,m.getOrDefault(s,0)+1);
        return m;
    }
    public static void main(String[] args) throws Exception {
        if (args.length>0 && Files.exists(Paths.get(args[0]))) {
            String t = Files.readString(Paths.get(args[0]));
            System.out.println(countWords(t));
        } else {
            String t = "Hello world, hello Java!";
            System.out.println(countWords(t));
        }
    }
}

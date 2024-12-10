package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void removeDuplicates(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        set.forEach(e -> System.out.print(e));
    }

    public static void removeDuplicatesUsingHashmap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        map.forEach((k,v) -> System.out.print(k));
    }
    public static void main(String[] args) {
        String s = "programming";
        removeDuplicates(s);

        System.out.println();
        removeDuplicatesUsingHashmap(s);
    }
}

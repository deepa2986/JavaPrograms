package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void printDuplicates(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
          char ch = s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " +entry.getValue());
        }
    }

    public  static void printDuplicatesUsingSet(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                System.out.println(ch);
            }else {
                set.add(ch);
            }
        }
    }
    public static void main(String[] args) {

        String s = "programming";
        printDuplicates(s);

        printDuplicatesUsingSet(s);
    }
}

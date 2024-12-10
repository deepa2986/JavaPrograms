package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void firstUniqueChar(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0) +1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {

        String s = "tea tree";
        firstUniqueChar(s);
    }
}

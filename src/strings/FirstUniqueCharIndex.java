package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharIndex {

    public  static int firstUniqueCharIndex(String s){
        for(int i = 0; i < s.length(); i++){
            int count = 1;
            for(int j = 0; j < s.length(); j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count == 1)
                return i;
        }
        return -1;
    }

    public static int firstUniqueCharIndexUsingHashMap(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count  = map.get(ch);
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String s = "character";
        int uniqueCharIndex = firstUniqueCharIndex(s);
        System.out.println(uniqueCharIndex);

        int index = firstUniqueCharIndexUsingHashMap(s);
        System.out.println(index);
    }
}

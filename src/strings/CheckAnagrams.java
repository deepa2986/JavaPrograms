package strings;

import java.util.Arrays;

public class CheckAnagrams {

    public static boolean checkAnagrams(String s1, String s2){

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        if(s1.length() != s2.length()){
            System.out.println("not anagrams");
            System.exit(0);
        }
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i = 0; i < charArray1.length; i++){
            if(charArray1[i] != charArray2[i]){
                return false;
            }
        }
       return true;
    }

    public static boolean isAnagram(String s1, String s2){
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
       return Arrays.equals(charArray1,charArray2);
    }

    public static boolean checkAnagram(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        int[] countArray = new int[256];

        for(int i = 0; i < s1.length() ; i++){
            countArray[s1.charAt(i) - 'a']++;
            countArray[s2.charAt(i) - 'a']--;
        }
        for(int j = 0; j < countArray.length; j++){
            if(countArray[j] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "tea";
        String s2 = "eat";

        boolean anagrams = checkAnagrams(s1, s2);
        System.out.println(anagrams);

        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);

        boolean b = checkAnagram(s1, s2);
        System.out.println(b);

    }
}

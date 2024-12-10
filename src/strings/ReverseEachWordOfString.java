package strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseEachWordOfString {

    public static void reverseEachWord(String s){
        String[] word = s.split(" ");
        String reverse = "";
        for (int i = 0; i < word.length; i++){
            reverse =  word[i] +" "+ reverse;
        }
        System.out.println(reverse);
    }

    public static void reverse(String s){
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           reverse = ch + reverse;
        }
        System.out.println(reverse);
    }

    public static String  reverseWords(String s){
        String[] words = s.split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        String s = "java programming made easy to develop apps";
        reverse(s);

        reverseEachWord(s);

        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);


    }
}

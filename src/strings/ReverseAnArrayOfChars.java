package strings;

import java.util.Arrays;

public class ReverseAnArrayOfChars {

    public static void reverseChars(char[] chars){
        int start = 0;
        int end = chars.length - 1;
        char temp;
        while (start < end){
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(chars));
    }
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d','e'};
        System.out.println(Arrays.toString(chars));

        reverseChars(chars);

    }
}

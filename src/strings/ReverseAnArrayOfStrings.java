package strings;

import java.util.Arrays;

public class ReverseAnArrayOfStrings {

    public static void reverseAnArrayOfStrings(String[] strings){
        int start = 0;
        int end = strings.length - 1;
        String temp;
        while (start < end){
            temp = strings[start];
            strings[start] = strings[end];
            strings[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {

        String[] strings = {"april","may","june","july","october"};
        System.out.println(Arrays.toString(strings));
        reverseAnArrayOfStrings(strings);
    }
}

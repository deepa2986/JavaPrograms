package strings;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String s){
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
         char temp = charArray[start];
         charArray[start] = charArray[end];
         charArray[end] = temp;
         start++;
         end--;
        }
        return new String(charArray);
    }

    public static void reverseStringUsingStack(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            stack.push(c);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static String reverseStringUsingRecursion(String s){
        if (s == null || s.length() <= 1)
            return s;
        return reverseStringUsingRecursion(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "tree bree";
        System.out.println(s);
        String reverseString = reverseString(s);
        System.out.println(reverseString);

        reverseStringUsingStack(s);
        System.out.println();
        String s1 = reverseStringUsingRecursion(s);
        System.out.println(s1);
    }
}

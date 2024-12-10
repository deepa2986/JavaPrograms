package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseAnArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverseAnArrayByRecursion(int[] array,int start,int end){
        if(start >= end)
            return;
        int temp;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reverseAnArrayByRecursion(array,start + 1, end - 1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
       // reverseAnArray(array);

        reverseAnArrayByRecursion(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));

    }
}

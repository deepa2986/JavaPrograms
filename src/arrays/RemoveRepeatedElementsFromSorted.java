package arrays;

import java.util.Arrays;

public class RemoveRepeatedElementsFromSorted{

    public static void removeDuplicates(int[] array){

        int j = 0;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i + 1]){
                array[j++] = array[i];
            }
        }
        array[j++] = array[array.length - 1];
        for(int i = 0; i < j; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,4,6,8,8};
        System.out.println(Arrays.toString(array));
        removeDuplicates(array);

    }
}

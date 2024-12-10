package arrays;

import java.util.*;

public class RemoveDuplicatesFromUnsorted {

    public static void removeDuplicatesUsingSorting(int[] array){
        Arrays.sort(array);
        int j = 0;
        for(int i = 0; i < array.length -1; i++){
            if(array[i] != array[i+1]){
                array[j++] = array[i];
            }
        }
        array[j++] = array[array.length - 1];
        for (int i = 0; i < j; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void removeDuplicatesUsingHashMap(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        map.forEach((k,v) -> System.out.print(k + " "));
    }

    public static void removeDuplicatesUsingSet(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {

        int[] array = {5,1,7,4,3,2,1,5,2,4,5,6};
        removeDuplicatesUsingSorting(array);

        System.out.println();
        removeDuplicatesUsingHashMap(array);

        System.out.println();
        removeDuplicatesUsingSet(array);
    }
}

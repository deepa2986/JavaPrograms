package strings;

public class PrintAllPermutationsOfString {

    public static void permute(String s,int start,int end){
        if(start == end){
            System.out.println(s);
        }else{
            for(int i = start; i <= end; i++){
                String swap = swap(s, start, i);
                permute(swap,start + 1,end);
              // swap(s,start,i);
            }
        }
    }

    private static String swap(String s, int i, int j) {

            char[] charArray = s.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return new String(charArray);

    }

    public static void main(String[] args) {

        String s = "abc";
        int start = 0;
        int end = s.length() - 1;

        permute(s,start,end);
    }
}

package strings;

public class CheckTwoStringsRotationsEachOther {

    public static void stringRotation(String s1,String s2){
        if(s1.length() != s2.length()){
            System.out.println("No rotation");
            return;
        }
        // String s3 = s1 + s1;
        String s3 = s1.concat(s1);
        if(s3.contains(s2)){
            //or
            // if(s3.indexOf(s2) != -1){
            System.out.println("rotation");
        }else System.out.println("no rotation");
    }
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cdab";
        String s3 = "cda";
        stringRotation(s1,s2);
        stringRotation(s1,s3);
    }
}

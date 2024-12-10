package strings;

public class RemoveSpace {

    public static String removeSpace(String s){
        String removeSpace = "";
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(!Character.isWhitespace(ch)){
               removeSpace = removeSpace + ch;
           }
        }
        return removeSpace;
    }

    public static void removeSpaces(String s){
        String removeSpace = s.replaceAll("\\s", "");
        System.out.println(removeSpace);
    }
    public static void main(String[] args) {
        String s = "stay strong stay healthy";
        String removeSpace = removeSpace(s);
        System.out.println(removeSpace);

        removeSpace(s);

        removeSpaces(s);
    }
}

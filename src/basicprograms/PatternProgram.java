package basicprograms;

public class PatternProgram {

    public static  void printRectanglePattern(int num){
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void printIncreasingTriangle(int num){
        for(int i = 0 ; i < num; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printDecreasingTriangle(int num){
        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printRightSidedIncreasingTriangle(int num){
        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                System.out.print(" " + " ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
    public static void rightSidedDecreasingTriangle(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" " + " ");
            }
            for(int j = i; j < num; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printHillPattern(int num){
        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                System.out.print(" " + " ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void printReverseHillPattern(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" "+ " ");
            }
            for(int j = i; j < num; j++){
                System.out.print("*" + " ");
            }
            for(int j = i; j < num; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printRectanglePattern(n);
        printIncreasingTriangle(n);

        System.out.println();
        printDecreasingTriangle(n);

        System.out.println();
        printRightSidedIncreasingTriangle(n);

        System.out.println();
        rightSidedDecreasingTriangle(n);

        System.out.println();
        printHillPattern(n);

        System.out.println();
        printReverseHillPattern(n);
    }
}

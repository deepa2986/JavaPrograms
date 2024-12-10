package basicprograms;

public class NumberPattern {
    public static void printIncreasingPatternWithOne(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("1"+ " ");
            }
            System.out.println();
        }
    }

    public static void printIncreasingPatternWithNum(int num){
        for(int i = 1, p = 1; i <= num; i++,p++){
            for(int j = 1; j <= i; j++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    public static void printDecreasingPatternWithNum(int num){
        for(int i = 1; i <= num ; i++){
            for(int j = i; j <= num; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printDecrementPattern(int num){
        for(int i = num; i > 0; i--){
            for(int j = i; j <= num; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void printIncrementPattern(int num){
        for(int i = 0,p = 0; i < num; i++, p+=2){
            for(int j = 0; j <= i; j++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    public static void printDecrementPatternByTwo(int num){
        for(int i = 1, p = 0; i <= num; i++ ,p+=2){
            for(int j = i; j <= num; j++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    public static void printIncreasingPatternWithAlternateNum(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("2" + " ");
                } else
                    System.out.print("1" + " ");
                }
                System.out.println();
            }
        }

    public static void printDecreasingPatternWithAlphabets(int num){
        for(int i = 1; i <= num; i++){
            for (int j = i; j <= num; j++){
                if(i % 2 == 0){
                    System.out.print("b" + " ");
                }else System.out.print("a" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        printIncreasingPatternWithOne(num);

        System.out.println();
        printIncreasingPatternWithNum(num);

        System.out.println();
        printDecreasingPatternWithNum(num);

        System.out.println();
        printDecrementPattern(num);

        System.out.println();
        printIncrementPattern(num);

        System.out.println();
        printDecrementPatternByTwo(num);

        System.out.println();
        printIncreasingPatternWithAlternateNum(num);

        System.out.println();
        printDecreasingPatternWithAlphabets(num);
    }
}

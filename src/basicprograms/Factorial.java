package basicprograms;

public class Factorial {

    public static void findFactorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int num = 5;
        findFactorial(num);
    }
}

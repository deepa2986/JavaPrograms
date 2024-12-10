package basicprograms;

public class FindGCDOrHCF {

    public static void gcdOfNumbers(int number1,int number2){
        int gcd = 1;
        for(int i = 1; i < number1 && i < number2; i++){
            if(number1 % i == 0 && number2 % i == 0)
               gcd = i; 
        }
        System.out.println(gcd);
    }
    public static void gcdOfNumber(int num1, int num2){
        while (num1 != num2) {
            if (num1 == 0) {
                System.out.println(num2);
                break;
            }
            if (num2 == 0) {
                System.out.println(num1);
                break;
            }

            if (num1 > num2) {
                num1 = num1 - num2;
            }
            if (num2 > num1) {
                num2 = num2 - num1;
            }
        }
        if(num1 == num2)
            System.out.println(num1);

    }
    public static void main(String[] args) {
        int number1 = 98, number2 = 56;
        gcdOfNumbers(number1,number2);
        gcdOfNumber(number1,number2);
    }
}

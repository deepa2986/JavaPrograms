package basicprograms;

public class FibonacciSeries {
    public static int fibonacciNumber(int num){
        if(num <= 1)
            return num;
        return fibonacciNumber(num -1) + fibonacciNumber(num - 2);
    }
    public static void fibonacciSeries(int number){
        int firstNum = 1;
        int secondNum = 1;
        int thirdNum;
        System.out.println(firstNum);
        System.out.println(secondNum);
        for(int i = 3; i <= number; i++){
            thirdNum = firstNum + secondNum;
            System.out.println(thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }
    public static void main(String[] args) {

        int num = 40;
        int fibonacci = fibonacciNumber(num);
        System.out.println(fibonacci);

        fibonacciSeries(num);
    }
}

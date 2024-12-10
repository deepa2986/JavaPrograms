package basicprograms;

public class SquareRootOfNumber {

    public static void squareRoot(int number){
        int sqrt = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                if(i * i == number){
                    sqrt = i;
                }
            }
        }
        if(sqrt == 0)
            System.out.println("no square root");
        else System.out.println(sqrt);
    }
    public static void main(String[] args) {

        int number = 81;
        squareRoot(number);
    }
}

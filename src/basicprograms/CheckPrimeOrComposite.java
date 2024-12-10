package basicprograms;

public class CheckPrimeOrComposite {
    public static void checkPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }

    public static void printPrimeNumbers(int number) {
        for(int i = 2; i < number; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int number = 11;
        checkPrime(number);

        printPrimeNumbers(number);
    }
}

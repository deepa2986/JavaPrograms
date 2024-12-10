package basicprograms;

public class SolveAnyNumberProgram {

    public static void printEachDigit(int number){
        while (number != 0){
            int digit = number % 10;
            System.out.println(digit);
            number = number/10;
        }
    }

    public static void checkPalindrome(int number){
        int oNumber = number;
        int reverse = 0;
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(reverse == oNumber)
            System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }

    public static void checkSpyNumber(int number){
        int sum  = 0;
        int product = 1;
        while (number != 0){
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        if (sum == product)
            System.out.println("spy number");
        else System.out.println("not a spy number");
    }

    public static void specialNumber(int number){
        int oNum = number;
        int sum = 0;
        int product = 1;
        while (number != 0){
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        if(sum + product == oNum)
            System.out.println("special number");
        else System.out.println("not a special number");
    }

    public static void harshadNumber(int number){
        int oNum = number;
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        if(sum == oNum)
            System.out.println("harshad number");
        else System.out.println("not a harshad number");
    }

    public static void duckNumber(int number){
        int count = 0;
        while (number != 0){
            int digit = number % 10;
            if(digit == 0)
                count++;
            number = number / 10;
        }
        if(count > 0)
            System.out.println("duck number");
        else System.out.println("not a duck number");
    }

    public static void countNumber(int number, int numToCount){
        int count = 0;
        while (number != 0){
            int digit = number % 10;
            if(digit == numToCount)
                count++;
            number = number / 10;
        }
        System.out.println("numToCount =  " +numToCount + " : " +count);
    }


    public static void main(String[] args) {
        int number = 562;
        printEachDigit(number);

        int num = 86868;
        checkPalindrome(num);

        int spyNum = 123;
        checkSpyNumber(spyNum);

        int spNum = 59;
        specialNumber(spNum);

        int hNum = 156;
        harshadNumber(hNum);

        int dNum = 402;
        duckNumber(dNum);

        int numb = 24123422;
        int numToCount = 2;
        countNumber(numb,numToCount);
    }
}

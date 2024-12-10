package basicprograms;

public class IntegerPalindrome {

    public static void isPalindrome(int number){
        int oNum = number;
        int reverse = 0;
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(reverse == oNum)
            System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }

    public static void main(String[] args) {
        int number = 12121;
        isPalindrome(number);
    }
}

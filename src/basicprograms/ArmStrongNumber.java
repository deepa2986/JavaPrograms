package basicprograms;

public class ArmStrongNumber {

    public static void armStrongNumber(int number){
        int oNum = number;
        int armStrong = 0;
        while (number > 0){
            int digit = number % 10;
           // digit = (int) Math.pow(digit,3);
            armStrong += (digit * digit * digit);
            number = number / 10;
        }
        if(armStrong == oNum)
            System.out.println("armstrong number");
        else System.out.println("not a armstrong number");
    }
    public static void main(String[] args) {

        int number = 153;
        armStrongNumber(number);
    }
}

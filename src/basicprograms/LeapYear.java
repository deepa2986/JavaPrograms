package basicprograms;

public class LeapYear {
    public static void checkLeapYear(int year){
        if(year % 400 == 0)
            System.out.println("leap year");
        else if(year % 100 == 0)
            System.out.println("not a leap year");
        else if(year % 4 == 0)
            System.out.println("leap year");
    }
    public static void main(String[] args) {
        int year = 2000;
        checkLeapYear(year);

    }
}

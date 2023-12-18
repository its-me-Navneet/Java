import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {

    static boolean checkValidNumber(int year) {

        int digit = (int) Math.log10(year);

        return digit == 3;
    }

    static boolean checkLeapYear(int year) {

        if (year % 400 == 0)
            return true;

        return year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) throws Exception { 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to check Leap year");
 
          try {
               int year = sc.nextInt();

        if (!checkValidNumber(year)) {
            System.out.println("Please enter 4 digit valid integer ");
            return;
        }

        boolean ans = checkLeapYear(year);

        if (ans == true)
            System.out.println("Yes");
        else
            System.out.println("No");
          } catch (Exception e) {
            System.out.println("Please enter valid no");
          }
      
    }

}
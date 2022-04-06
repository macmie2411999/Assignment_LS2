import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("A Year To Check: ");
        Integer inputYear = scannerInput.nextInt();
        Boolean leapYear = false;

        // if the year is divided by 4
        if (inputYear % 4 == 0) {
            // if the year is century
            if (inputYear % 100 == 0) {
                // if year is divided by 400 then it is a leap year
                if (inputYear % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
            // if the year is not century
            else
                leapYear = true;
        } else
            leapYear = false;
        if (leapYear)
            System.out.println(inputYear + " Is A Leap Year!");
        else
            System.out.println(inputYear + " Is Not A Leap Year!");
    }
}


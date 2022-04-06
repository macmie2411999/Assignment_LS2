import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer number = scannerInput.nextInt();
        scannerInput.close();

        System.out.print("Sum of all index in " + number + " is: " + (sumOfIndexs(number)));
    }

    // calculate the sum of index
    public static Integer sumOfIndexs(Integer number) {
        Integer remainder = 0;
        while (number >= 10) {
            remainder += number % 10;
            number = (number - (number % 10)) / 10;
        }
        return remainder + number;
    }
}

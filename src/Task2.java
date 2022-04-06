import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer decimalNumber = scannerInput.nextInt();
        scannerInput.close();
        StringBuilder element = new StringBuilder(convertToDecimal(decimalNumber));
        element.reverse();
        System.out.println(decimalNumber + " in Decimal converted to Binary is: " + element);
    }

    // convert to decimal
    public static String convertToDecimal(Integer decimalNumber) {
        String element = " ";
        while (decimalNumber > 0) {
            if (decimalNumber % 2 == 0) {
                decimalNumber = decimalNumber / 2;
                element = element + "0";
            } else {
                decimalNumber = (decimalNumber - 1) / 2;
                element = element + "1";
            }
        }
        return element;
    }
}

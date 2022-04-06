import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer inputNumber = scannerInput.nextInt();
        scannerInput.close();

        Integer sumOfPrimeNumbers = 0;
        String stringPrimeNumbers = "";
        for (int isPrimeNumber = 2; isPrimeNumber < inputNumber; isPrimeNumber++) {
            if (checkPrimeNumber(isPrimeNumber) == true) {
                sumOfPrimeNumbers += isPrimeNumber;
                stringPrimeNumbers += " " + isPrimeNumber;
            }
        }

        // print results
        System.out.println("The List Of Prime Numbers Of " + inputNumber + " Is" + stringPrimeNumbers);
        System.out.println("The Sum Of Prime Numbers Of " + inputNumber + " Is " + sumOfPrimeNumbers);
    }

    // check prime number
    public static Boolean checkPrimeNumber(Integer checkNumber) {
        for (int i = 2; i < checkNumber / 2 + 1; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}

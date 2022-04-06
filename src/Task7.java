import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer inputNumber = scannerInput.nextInt();
        scannerInput.close();

        String stringResult = "";
        for (int i = 1; i <= inputNumber / 2; i++) {
            if (inputNumber % i == 0) {
                stringResult += " " + i;
            }
        }

        System.out.println("The list of divisors of the number " + inputNumber + " is:" + stringResult);
    }
}

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer inputNumber = scannerInput.nextInt();
        scannerInput.close();

        int result = (int) Math.floor(Math.log(inputNumber) / Math.log(2));
        System.out.println("The biggest number smaller than the base 2 of " + inputNumber + " is " + result);
    }
}

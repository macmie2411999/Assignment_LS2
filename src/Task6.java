import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your String: ");
        Scanner scannerInput = new Scanner(System.in);
        String inputString = scannerInput.nextLine();
        scannerInput.close();

        // use StringBuilder
        StringBuilder reverseString = new StringBuilder(inputString);
        reverseString.reverse();
        System.out.println(inputString + " is reversed to: " + reverseString);
    }
}

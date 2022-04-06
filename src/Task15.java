import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task15 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Your String: ");
        String inputString = scannerInput.nextLine();


        // methods
        lengthOfString(inputString);
        charAtIndex(inputString);
        checkMatchString(inputString);

        scannerInput.close();
    }

    public static void lengthOfString(String inputString) {
        System.out.println("The Length Of The String '" + inputString + "' Is: " + inputString.length());
    }

    public static void charAtIndex(String inputString) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("The Index Of Char: ");
        Integer designatedIndex = scannerInput.nextInt();
        scannerInput.reset();
        scannerInput.close();

        System.out.println("The Char At The Index " + designatedIndex
                + " Of String '" + inputString + "' Is: "
                + inputString.charAt(designatedIndex - 1));
    }

    public static void checkMatchString(String inputString) {
        // regular expressions
        Pattern pattern = Pattern.compile(".*" + "abcdef" + ".*");
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            System.out.println("The String '" + inputString + "' contains 'abcdef'!");
        } else {
            System.out.println("The String '" + inputString + "' does not contains 'abcdef'!");
        }
    }
}

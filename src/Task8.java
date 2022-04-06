import com.sun.deploy.util.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your String: ");
        Scanner scannerInput = new Scanner(System.in);
        String inputString = scannerInput.nextLine();
        scannerInput.close();

        // "\\s" is space
        String convertString = "";
        String[] list = inputString.split("\\s");
        for (String element : list) {
            convertString += element.substring(0, 1).toUpperCase() + element.substring(1) + " ";
        }

        System.out.println(convertString);
    }
}

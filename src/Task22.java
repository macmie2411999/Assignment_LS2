import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Your String: ");
        String inputString = scannerInput.nextLine();
        longestPalindromeSubstr(inputString);
        scannerInput.close();
    }

    static int longestPalindromeSubstr(String inputString) {
        int maxLength = 1, startPosition = 0;

        // create a loop to mark start and end index
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i; j < inputString.length(); j++) {
                int flag = 1;

                // check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (inputString.charAt(i + k) != inputString.charAt(j - k))
                        flag = 0;

                // palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    startPosition = i;
                    maxLength = j - i + 1;
                }
            }
        }

        System.out.print("Longest palindrome string is: ");
        printSubString(inputString, startPosition, startPosition + maxLength - 1);
        System.out.print("\nLongest palindrome sub-string is: ");
        printSubString(inputString, startPosition + maxLength/2, startPosition + maxLength - 1);

        // return length of palindrome
        return maxLength;
    }

    // print a substring
    static void printSubString(String subString, int startPosition, int endPosition) {
        for (int i = startPosition; i <= endPosition; ++i)
            System.out.print(subString.charAt(i));
    }
}

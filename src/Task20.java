import java.util.ArrayList;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        // get input
        System.out.print("The Number of Elements Of Array: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer inputNumber = scannerInput.nextInt();

        // add elements into list
        ArrayList<Integer> inputList = new ArrayList<>();
        System.out.print("The List Of Elements: ");
        for (int i = 1; i <= inputNumber; i++) {
            inputList.add(scannerInput.nextInt());
        }

        // call method
        oddEvenElements(inputList);
    }

    // sort out odd and even elements in the array
    public static void oddEvenElements(ArrayList<Integer> inputList) {
        final String[] oddString = {""};
        final String[] evenString = {""};
        inputList.forEach((element) -> {
            if (element % 2 == 0) {
                evenString[0] += " " + element;
            } else {
                oddString[0] += " " + element;
            }
        });

        System.out.println("The List Of Even Elements: " + evenString[0]);
        System.out.println("The List Of Even Elements: " + oddString[0]);
    }
}

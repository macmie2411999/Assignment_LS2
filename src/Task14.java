import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task14 {
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

        //show list
        System.out.print("Your Array List: ");
        showList(inputList);

        // remove duplicate elements
        ArrayList<Integer> newList = (ArrayList<Integer>) inputList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.print("\nYour New Free-Duplicate Elements Array List: ");
        showList(newList);
    }

    // show list
    public static void showList(ArrayList<Integer> inputList) {
        inputList.forEach((element) -> System.out.print(" " + element));
    }
}

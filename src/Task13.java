import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task13 {
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

        // call methods
        // oddEvenElements(inputList);
        findConditionalVariables(inputList, inputNumber);
    }

    // show list
    public static void showList(ArrayList<Integer> inputList) {
        System.out.print("Your List: ");
        inputList.forEach((element) -> System.out.print(" " + element));
    }

    // find min, max, average in the array
    public static void findConditionalVariables(ArrayList<Integer> inputList, Integer inputNumber) {
        // calculate average, min, max
        Integer sum = 0;
        Integer countPositiveNumber = 0;
        Integer countNegativeNumber = 0;
        Integer min = Collections.min(inputList);
        Integer max = Collections.max(inputList);

        for (Integer element : inputList) {
            sum += element;
            if(element >= 0 ){
                countPositiveNumber++;
            } else{
                countNegativeNumber++;
            }
        }

        System.out.println("Average: " + (double) sum / inputNumber);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // find conditional negative numbers
        if (min > 0) {
            System.out.println("There is no smallest or biggest number which is negative!");
        } else {
            if(countNegativeNumber >= 2){
                Integer tempMin = -1;
                for(Integer elementTemp : inputList){
                    if (elementTemp == tempMin) {
                        System.out.println("The biggest number which is negative is: " + elementTemp);
                        System.out.println("The smallest number which is negative is: " + min);
                        break;
                    }
                    tempMin--;
                }
            } else if(countNegativeNumber == 1){
                System.out.println("The only number which is negative is: " + min);
            }
        }

        // find conditional positive numbers
        if (max < 0) {
            System.out.println("There is no smallest or biggest number which is positive!");
        } else {
            if(countPositiveNumber >= 2){
                Integer tempMax = 1;
                for(Integer elementTemp : inputList){
                    if (elementTemp == tempMax) {
                        System.out.println("The biggest number which is positive is: " + elementTemp);
                        System.out.println("The smallest number which is positive is: " + max);
                        break;
                    }
                    tempMax++;
                }
            } else if(countPositiveNumber == 1){
                System.out.println("The only number which is positive is: " + max);
            }
        }
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

    // add new element into the array by index
    public static void addElement(ArrayList<Integer> inputList, Integer inputNumber) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the index of element you want to add: ");
        Integer designatedIndex = scannerInput.nextInt();
        System.out.println("Enter the value of element you want to add: ");
        Integer valueOfDesignatedIndex = scannerInput.nextInt();
        scannerInput.close();

        if (designatedIndex > inputNumber || designatedIndex < 1) {
            inputList.add(designatedIndex, valueOfDesignatedIndex);
            System.out.println("Succesfully!");
        } else {
            System.out.println("The index is wrong!");
        }
        showList(inputList);
    }

    // remove an element out of the array by index
    public static void deleteElement(ArrayList<Integer> inputList, Integer inputNumber) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the index of element you want to delete: ");
        Integer designatedIndex = scannerInput.nextInt();
        scannerInput.close();

        if (designatedIndex > inputNumber || designatedIndex < 1) {
            inputList.remove(designatedIndex);
            System.out.println("Succesfully!");
        } else {
            System.out.println("The index is wrong!");
        }
        showList(inputList);
    }
}

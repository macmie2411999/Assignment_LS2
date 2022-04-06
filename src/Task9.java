import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);

        System.out.print("The First Number: ");
        Integer firstNumber = scannerInput.nextInt();
        System.out.print("The Second Number: ");
        Integer secondNumber = scannerInput.nextInt();

        scannerInput.close();

        // check conditions
        if (((9 < firstNumber) && (100 > firstNumber)) || ((9 < secondNumber) && (100 > secondNumber))) {
            Integer firstIndexOfFirstNumber = firstNumber % 10;
            Integer secondIndexOfFirstNumber = (firstNumber - firstIndexOfFirstNumber) / 10;
            Integer firstIndexOfSecondNumber = secondNumber % 10;
            Integer secondIndexOfSecondNumber = (secondNumber - firstIndexOfSecondNumber) / 10;

            System.out.println(firstIndexOfFirstNumber + " "
                    + secondIndexOfFirstNumber + " "
                    + firstIndexOfSecondNumber + " "
                    + secondIndexOfSecondNumber);

            if ((firstIndexOfFirstNumber == firstIndexOfSecondNumber)
                    || (firstIndexOfFirstNumber == secondIndexOfSecondNumber)
                    || (secondIndexOfFirstNumber == firstIndexOfSecondNumber)
                    || (secondIndexOfFirstNumber == secondIndexOfSecondNumber)) {
                System.out.println("Result: true");
            } else {
                System.out.println("Result: false");
            }
        } else {
            System.out.println("Error!");
        }
    }
}

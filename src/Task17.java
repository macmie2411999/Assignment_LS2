import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Integer selectedNumber = createRandomNumber();
        Integer guessWork = 0;
        Boolean isTrue = true;

        System.out.print("Guess a number: ");
        Scanner inputScanner = new Scanner(System.in);
        while (isTrue) {
            guessWork = inputScanner.nextInt();
            inputScanner.reset();

            if (guessWork < selectedNumber) {
                System.out.print("Guess a number bigger than " + guessWork + ": ");
            } else if (guessWork > selectedNumber) {
                System.out.print("Guess a number smaller than " + guessWork + ": ");
            } else {
                isTrue = false;
            }
        }
        System.out.print("The Correct Number Is " + selectedNumber + "!");
        inputScanner.close();
    }

    public static Integer createRandomNumber() {
        Integer min = 1;
        Integer max = 1000;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

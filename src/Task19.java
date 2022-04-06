import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        menuInterface();
    }

    public static void menuInterface() {
        Boolean checkExitFlag = false;
        Integer selectedButton = null;

        while (!checkExitFlag) {
            System.out.println("----------Solve First-degree/Quadratic Equation----------");
            System.out.println("1. Press 1 to solve First-degree Equation.");
            System.out.println("2. Press 2 to solve Quadratic Equation.");
            System.out.println("3. Press 3 to solve Exit.");
            System.out.println("----------                 End                 ----------");

            Scanner inputScanner = new Scanner(System.in);
            selectedButton = inputScanner.nextInt();

            if (selectedButton == 1) {
                solveFirstDegreeEquation(inputScanner);
            } else if (selectedButton == 2) {
                solveQuadraticEquation(inputScanner);
            } else if (selectedButton == 3) {
                checkExitFlag = true;
            } else {
                System.out.println("The input is incorrect!");
                continue;
            }
            inputScanner.close();
            checkExitFlag = true;
        }
    }

    public static void solveFirstDegreeEquation(Scanner inputScanner) {
        // get input
        System.out.print("The first number: ");
        Double firstNumber = inputScanner.nextDouble();
        System.out.print("The second number: ");
        Double secondNumber = inputScanner.nextDouble();

        //comparing the value of firstNumber with 0, if firstNumber is 0 then the equation is wrong
        if (firstNumber == 0) {
            System.out.println("The value of a cannot be 0!");
            return;
        }

        System.out.println("The variable is: " + -secondNumber / firstNumber);
    }

    //defining a static method that finds the roots of the quadratic equation
    static void solveQuadraticEquation(Scanner inputScanner) {
        // get input
        System.out.print("The first number: ");
        Double firstNumber = inputScanner.nextDouble();
        System.out.print("The second number: ");
        Double secondNumber = inputScanner.nextDouble();
        System.out.print("The third number: ");
        Double thirdNumber = inputScanner.nextDouble();

        //comparing the value of firstNumber with 0, if firstNumber is 0 then the equation is not quadratic
        if (firstNumber == 0) {
            System.out.println("The value of a cannot be 0!");
            return;
        }
        //calculating discriminant (delta)
        Double delta = Math.pow(secondNumber, 2) - 4 * firstNumber * thirdNumber;
        double sqrtval = Math.sqrt(Math.abs(delta));
        if (delta > 0) {
            System.out.println("The roots of the equation are real and different!");
            System.out.println("The first variable is: " + (-secondNumber - sqrtval) / (2 * firstNumber));
            System.out.println("The second variable is: " + (-secondNumber + sqrtval) / (2 * firstNumber));
        } else if (delta == 0) {
            System.out.println("The roots of the equation are real and same!");
            System.out.println("The first and second variable equal: " + -secondNumber / (2 * firstNumber));
        }
        // executes if delta < 0
        else {
            System.out.println("The roots of the equation are complex and different!");
            System.out.println("The first variable is: " + -secondNumber / (2 * firstNumber) + " + " + sqrtval + "i");
            System.out.println("The second variable is: " + -secondNumber / (2 * firstNumber) + " - " + sqrtval + "i");
        }
    }
}

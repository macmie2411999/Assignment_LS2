import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // get input
        System.out.print("Your Number: ");
        Scanner scannerInput = new Scanner(System.in);
        Integer inputNumber = scannerInput.nextInt();
        scannerInput.close();
        Integer flag = 1;

        System.out.println("Your Triangle: ");
        for (int i = 1; i <= inputNumber; i++) {
            flag = 1;
            for (int j = 1; j <= inputNumber; j++) {
                if (i >= j) {
                    System.out.print(flag++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

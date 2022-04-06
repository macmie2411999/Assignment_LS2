import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Coordinate A(x,y): ");
        Double Ax = scannerInput.nextDouble();
        Double Ay = scannerInput.nextDouble();

        System.out.print("Coordinate B(x,y): ");
        Double Bx = scannerInput.nextDouble();
        Double By = scannerInput.nextDouble();

        scannerInput.close();

        System.out.println("The length of the straight is: "
                + Math.sqrt(Math.pow((Bx - Ax), 2) + Math.pow((By - Ay), 2)));

    }
}

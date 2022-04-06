import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("The position and velocity of the first kangaroo: ");
        Integer positionOfTheFirstKangaroo = scannerInput.nextInt();
        Integer velocityOfTheFirstKangaroo = scannerInput.nextInt();

        System.out.print("The position and velocity of the second kangaroo: ");
        Integer positionOfTheSecondKangaroo = scannerInput.nextInt();
        Integer velocityOfTheSecondKangaroo = scannerInput.nextInt();


        // call method
        calculatePosition(positionOfTheFirstKangaroo, velocityOfTheFirstKangaroo,
                positionOfTheSecondKangaroo, velocityOfTheSecondKangaroo);
        scannerInput.close();
    }

    // calculate the cross-position if the two meet
    public static void calculatePosition(Integer positionOfTheFirstKangaroo,
                                         Integer velocityOfTheFirstKangaroo,
                                         Integer positionOfTheSecondKangaroo,
                                         Integer velocityOfTheSecondKangaroo) {
        Integer timesToJump = 0;

        if ((positionOfTheFirstKangaroo == positionOfTheSecondKangaroo)
                && (velocityOfTheFirstKangaroo == velocityOfTheSecondKangaroo)) {
            System.out.println("Two Kangaroos meet right at the start!");
        } else if ((positionOfTheFirstKangaroo - positionOfTheSecondKangaroo)
                * (velocityOfTheFirstKangaroo - velocityOfTheSecondKangaroo) >= 0) {
            System.out.println("Two Kangaroos will never meet!");
        } else {
            Integer distanceFromKangaroos = Math.abs(positionOfTheFirstKangaroo - positionOfTheSecondKangaroo);
            Integer gapBetweenVelocities = Math.abs(velocityOfTheFirstKangaroo - velocityOfTheSecondKangaroo);
            if (gapBetweenVelocities > distanceFromKangaroos) {
                timesToJump = gapBetweenVelocities / distanceFromKangaroos;
            } else {
                timesToJump = distanceFromKangaroos / gapBetweenVelocities;
            }

            System.out.println("Two Kangaroo will meet after " + timesToJump + " jumps!");
        }
    }
}

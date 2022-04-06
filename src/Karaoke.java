import java.util.Scanner;

public class Karaoke {
    public static void main(String[] args) {
        checkIn();
    }

    public static void checkIn() {
        Double flag_startTime = Double.valueOf(1);
        Double timeFee = Double.valueOf(1);
        Double waterFee = Double.valueOf(1);

        // take inputs
        Scanner scanner_Time = new Scanner(System.in);
        System.out.print("Start at: ");
        Integer startTime = scanner_Time.nextInt();
        System.out.print("End at: ");
        Integer endTime = scanner_Time.nextInt();
        System.out.print("Number of water bottles: ");
        Scanner scanner_WaterBottles = new Scanner(System.in);
        Integer bottlesWater = scanner_WaterBottles.nextInt();

        //end threads
        scanner_Time.close();
        scanner_WaterBottles.close();

        //check the time
        if ((startTime < 9) || (endTime > 24) || (startTime >= endTime)) {
            System.out.println("Something is wrong with time");
            return;
        } else {
            if (startTime <= 17) {
                flag_startTime = 0.8;
            }

            // cost of time calculation
            Integer serviceUsageTime = endTime - startTime;
            if (serviceUsageTime <= 3) {
                timeFee = serviceUsageTime * 30000 * flag_startTime;
            } else {
                timeFee = Double.valueOf(((serviceUsageTime - 3) * 27000 + 90000)) * flag_startTime;
            }

            // cost of water calculation
            waterFee = bottlesWater * 10000 * flag_startTime;

            //print out
            System.out.println("\n--------------------------------------------------");
            System.out.println("Cost of time: " + timeFee);
            System.out.println("Cost of water: " + waterFee);
            System.out.println("Total: " + (waterFee + timeFee));
            System.out.println("--------------------------------------------------");
        }
    }
}

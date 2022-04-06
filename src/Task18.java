import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // get input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Deposit: ");
        Double deposit = scannerInput.nextDouble();
        scannerInput.nextLine();
        System.out.print("Total: ");
        Double totalMoney = scannerInput.nextDouble();
        scannerInput.nextLine();
        System.out.print("Interest Rate: ");
        Double interestRate = scannerInput.nextDouble();
        scannerInput.nextLine();

        calculateWaitingYears(deposit, totalMoney, interestRate);
        scannerInput.close();
    }

    public static void calculateWaitingYears(Double deposit, Double totalMoney, Double interestRate){
        for(int waitingYears = 1; ;waitingYears++){
            deposit *= interestRate;
            if(deposit >= totalMoney){
                System.out.print("After " + waitingYears + " years, you can buy a car!" );
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        double totalAmount = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("***** BANKING PROGRAM *****\n");
            System.out.println("What action do you want to make ?");
            System.out.println("1: Show balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println("***************************\n");

            choice = scanner.nextInt();

            switch (choice) {

                case 1 -> showBalance(totalAmount);
                case 2 -> totalAmount += deposit();
                case 3 -> totalAmount -= withdraw(totalAmount);
                case 4 -> {
                    System.out.println("Thanks for your visit !");
                    isRunning = false;
                }
                default -> {
                    System.out.println("This is not a valid  command");
                }

            }
        }

    }

    static void showBalance(double totalAmount) {
        System.out.println("$" + totalAmount);
    }

    static double deposit() {

        double deposit;

        System.out.print("How much money do you want to be deposited ? ");
        deposit = scanner.nextDouble();

        if (deposit < 0) {
            System.out.println("Deposit can't be negative");
            return 0;
        }
        else {
          return deposit;  
        }       
    }

    static double withdraw(double totalAmount) {

        double withdraw;

        System.out.print("How much money do you want to withdraw ? ");
        withdraw = scanner.nextDouble();

        if (withdraw > totalAmount) {
            System.out.println("Impossible action, you can't withdraw more money than you have !");
            return 0;
        }
        else {
            return withdraw;
        }
    }


}
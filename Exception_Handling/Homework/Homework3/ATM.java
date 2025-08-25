import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        boolean running = true;

        try {
            while (running) {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();

                try {
                    int option = Integer.parseInt(choice);

                    switch (option) {
                        case 1: // Withdraw
                            System.out.print("Enter withdrawal amount: ");
                            int withdraw = Integer.parseInt(sc.nextLine());
                            if (withdraw > balance) {
                                throw new Exception("Insufficient balance!");
                            }
                            balance -= withdraw;
                            System.out.println("Withdrawal successful. New Balance: ₹" + balance);
                            break;

                        case 2: // Deposit
                            System.out.print("Enter deposit amount: ");
                            int deposit = Integer.parseInt(sc.nextLine());
                            balance += deposit;
                            System.out.println("Deposit successful. New Balance: ₹" + balance);
                            break;

                        case 3: // Balance
                            System.out.println("Your Balance: ₹" + balance);
                            break;

                        case 4: // Exit
                            running = false;
                            break;

                        default:
                            System.out.println("Invalid option! Please choose 1-4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using ATM.");
        }
    }
}

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 5000; // fixed balance
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter withdrawal amount: ");
            int amount = Integer.parseInt(sc.nextLine());

            if (amount > balance) {
                throw new Exception("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Thank you for using ATM.");
        }
    }
}

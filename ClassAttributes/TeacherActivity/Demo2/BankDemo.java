class BankAccount {
    int accountNumber;
    double balance = 0;
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 101;
        acc1.balance = 5000;

        System.out.println("Account " + acc1.accountNumber + " Balance: " + acc1.balance);

        // Deposit
        acc1.balance += 2000;
        System.out.println("After deposit: " + acc1.balance);

        // Withdraw
        acc1.balance -= 3000;
        System.out.println("After withdrawal: " + acc1.balance);
    }
}

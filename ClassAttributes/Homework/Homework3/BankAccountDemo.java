class BankAccount {
    int accountNumber;
    String holderName;
    double balance;
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.accountNumber = 101;
        a1.holderName = "Amit";
        a1.balance = 5000;

        BankAccount a2 = new BankAccount();
        a2.accountNumber = 102;
        a2.holderName = "Neha";
        a2.balance = 8000;

        BankAccount a3 = new BankAccount();
        a3.accountNumber = 103;
        a3.holderName = "Ravi";
        a3.balance = 12000;

        double total = a1.balance + a2.balance + a3.balance;
        System.out.println("Total Money in Bank: " + total);

        // Deposit into a2's account
        a2.balance += 2000;

        total = a1.balance + a2.balance + a3.balance;
        System.out.println("Updated Total Money in Bank: " + total);
    }
}

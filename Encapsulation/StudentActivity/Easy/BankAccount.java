class BankAccount {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class Test1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("Initial Balance: " + acc.getBalance());
        acc.deposit(500);
        System.out.println("After Deposit: " + acc.getBalance());
    }
}

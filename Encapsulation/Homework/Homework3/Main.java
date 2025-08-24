class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountNumber() { return accountNumber; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }
    public double getBalance() { return balance; }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("B202");
        account.deposit(10000);
        account.withdraw(3000);
        account.withdraw(8000); // Insufficient
        System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }
}

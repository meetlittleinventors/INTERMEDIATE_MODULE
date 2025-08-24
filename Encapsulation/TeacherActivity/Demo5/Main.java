class Account {
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
        Account a = new Account();
        a.setAccountNumber("A101");
        a.deposit(5000);
        a.withdraw(2000);
        a.withdraw(4000); // Insufficient
        System.out.println("Account: " + a.getAccountNumber() + ", Balance: " + a.getBalance());
    }
}

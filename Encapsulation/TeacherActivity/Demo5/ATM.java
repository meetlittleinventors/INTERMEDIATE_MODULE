class ATM {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " → Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + " → Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

public class Test5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(5000);
        atm.withdraw(2000);
        atm.checkBalance();
    }
}

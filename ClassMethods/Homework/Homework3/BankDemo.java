class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void transfer(BankAccount target, double amount) {
        if (amount <= balance) {
            this.withdraw(amount);
            target.deposit(amount);
            System.out.println("Transferred " + amount + " to Account " + target.accountNumber);
        } else {
            System.out.println("Transfer failed: Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 101;
        acc1.balance = 5000;

        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = 102;
        acc2.balance = 3000;

        acc1.showBalance();
        acc2.showBalance();

        acc1.deposit(2000);
        acc1.showBalance();

        acc1.withdraw(2500);
        acc1.showBalance();

        acc1.transfer(acc2, 3000);
        acc1.showBalance();
        acc2.showBalance();
    }
}

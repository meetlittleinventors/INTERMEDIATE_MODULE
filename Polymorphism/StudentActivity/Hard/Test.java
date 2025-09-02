class Account {
    void calculateInterest(double amount) {
        System.out.println("Calculating interest on amount: " + amount);
    }
}

class SavingsAccount extends Account {
    void calculateInterest(double amount) {
        System.out.println("Savings Account Interest = " + (amount * 0.04));
    }
}

class FixedDeposit extends Account {
    void calculateInterest(double amount) {
        System.out.println("Fixed Deposit Interest = " + (amount * 0.07));
    }
}

public class Test {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        Account a2 = new FixedDeposit();
        a1.calculateInterest(10000);
        a2.calculateInterest(10000);
    }
}

class Transaction {
    void process() { System.out.println("Processing transaction"); }
}
class Deposit extends Transaction {
    void process() { System.out.println("Deposit completed"); }
}
class Withdraw extends Transaction {
    void process() { System.out.println("Withdrawal completed"); }
}
class Transfer extends Transaction {
    void process() { System.out.println("Transfer completed"); }
}

public class Main {
    public static void main(String[] args) {
        Transaction[] transactions = {new Deposit(), new Withdraw(), new Transfer()};
        for(Transaction t : transactions) {
            t.process();
        }
    }
}

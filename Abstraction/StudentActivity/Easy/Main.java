abstract class Payment {
    abstract void pay(int amount);
}

class CashPayment extends Payment {
    void pay(int amount) {
        System.out.println("Paid ₹" + amount + " in cash.");
    }
}

class CardPayment extends Payment {
    void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using card.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new CardPayment();
        p1.pay(500);
        p2.pay(1200);
    }
}

class Payment {
    void pay() {
        System.out.println("Payment method selected");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Payment done using Cash");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Payment p1 = new Cash();
        Payment p2 = new UPI();
        p1.pay();
        p2.pay();
    }
}

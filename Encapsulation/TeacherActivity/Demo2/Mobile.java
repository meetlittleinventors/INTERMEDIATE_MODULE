class Mobile {
    private int pin = 1234;

    public void unlockPhone(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Phone Unlocked");
        } else {
            System.out.println("Access Denied");
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.unlockPhone(1234);  // correct pin
        m.unlockPhone(1111);  // wrong pin
    }
}

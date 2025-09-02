class Device {
    void turnOn() {
        System.out.println("Device is turning on...");
    }
}

class Phone extends Device {
    void makeCall() {
        System.out.println("Making a phone call...");
    }
}

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.turnOn();
        p.makeCall();
    }
}

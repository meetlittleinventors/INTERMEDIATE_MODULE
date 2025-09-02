class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on");
    }
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan starts rotating");
    }
}

class Light extends Appliance {
    void turnOn() {
        System.out.println("Light is switched on");
    }
}

public class Test {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 = new Light();
        a1.turnOn();
        a2.turnOn();
    }
}

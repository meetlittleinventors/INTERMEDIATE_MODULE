abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance {
    void turnOn() { System.out.println("Fan is ON"); }
    void turnOff() { System.out.println("Fan is OFF"); }
}

class WashingMachine extends Appliance {
    void turnOn() { System.out.println("Washing Machine is ON"); }
    void turnOff() { System.out.println("Washing Machine is OFF"); }
}

public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance wm = new WashingMachine();
        fan.turnOn();
        fan.turnOff();
        wm.turnOn();
        wm.turnOff();
    }
}

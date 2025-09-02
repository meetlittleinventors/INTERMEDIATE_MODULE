abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan starts spinning");
    }
}

class Light extends Appliance {
    void turnOn() {
        System.out.println("Light glows");
    }
}

public class Test9 {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 = new Light();
        a1.turnOn();
        a2.turnOn();
    }
}

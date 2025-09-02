class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car drives on road");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike rides on road");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.move();
        v2.move();
    }
}

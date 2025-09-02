abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Bike is riding");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.drive();
        v2.drive();
    }
}

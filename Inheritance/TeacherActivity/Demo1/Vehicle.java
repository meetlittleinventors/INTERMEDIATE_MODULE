// Single Inheritance Example
class Vehicle {
    void showInfo() {
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {   // Single Inheritance
    void openTrunk() {
        System.out.println("Car trunk opened.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showInfo();
        myCar.openTrunk();
    }
}

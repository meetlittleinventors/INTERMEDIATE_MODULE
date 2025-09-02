class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    Car(String brand, int speed) {
        super(brand, speed);
    }
    void openTrunk() {
        System.out.println("Trunk is open!");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car("BMW", 120);
        c.showInfo();
        c.openTrunk();
    }
}

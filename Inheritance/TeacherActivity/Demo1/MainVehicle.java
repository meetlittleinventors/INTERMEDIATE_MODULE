class Vehicle {
    String brand;
    int speed;

    void showInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Trunk is opened");
    }
}

class Bike extends Vehicle {
    void doWheelie() {
        System.out.println("Bike is doing a wheelie");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.showInfo();
        car.openTrunk();

        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.speed = 80;
        bike.showInfo();
        bike.doWheelie();
    }
}

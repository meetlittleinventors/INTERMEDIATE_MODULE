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

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.showInfo();
        car.openTrunk();
    }
}

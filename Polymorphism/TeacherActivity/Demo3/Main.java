class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}
class Car extends Vehicle {
    void start() { System.out.println("Car starts"); }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}

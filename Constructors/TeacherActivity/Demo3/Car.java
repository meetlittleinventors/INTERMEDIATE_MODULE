class Car {
    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println(brand + " costs " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 1500000);
        Car c2 = new Car("Honda", 1300000);

        c1.display();
        c2.display();
    }
}

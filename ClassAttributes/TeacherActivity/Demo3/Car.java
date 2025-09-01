class Car {
    String brand;
    int price;
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Toyota";
        c1.price = 1500000;

        c2.brand = "Honda";
        c2.price = 1300000;

        System.out.println(c1.brand + " costs " + c1.price);
        System.out.println(c2.brand + " costs " + c2.price);
    }
}

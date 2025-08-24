class Mobile {
    String brand;
    int price;
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;

        System.out.println("Brand: " + m1.brand + ", Price: " + m1.price);
    }
}

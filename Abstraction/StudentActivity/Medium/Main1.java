abstract class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract double getDiscountedPrice();
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }
    double getDiscountedPrice() {
        return price * 0.9; // 10% discount
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
    double getDiscountedPrice() {
        return price * 0.8; // 20% discount
    }
}

public class Main1 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 50000);
        Product p2 = new Clothing("T-shirt", 1000);
        System.out.println(p1.name + " Price after discount: ₹" + p1.getDiscountedPrice());
        System.out.println(p2.name + " Price after discount: ₹" + p2.getDiscountedPrice());
    }
}

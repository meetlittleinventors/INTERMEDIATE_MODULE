class Product {
    String name;
    int price;
    int quantity;
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Book";
        p1.price = 200;
        p1.quantity = 2;

        Product p2 = new Product();
        p2.name = "Pen";
        p2.price = 10;
        p2.quantity = 5;

        Product p3 = new Product();
        p3.name = "Bag";
        p3.price = 800;
        p3.quantity = 1;

        int total = (p1.price * p1.quantity) + (p2.price * p2.quantity) + (p3.price * p3.quantity);
        System.out.println("Total Bill = " + total);

        // Update quantity of pens
        p2.quantity = 10;
        total = (p1.price * p1.quantity) + (p2.price * p2.quantity) + (p3.price * p3.quantity);
        System.out.println("Updated Total Bill = " + total);
    }
}

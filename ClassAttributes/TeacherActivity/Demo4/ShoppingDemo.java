class Item {
    String itemName;
    int price;
    int quantity;
}

public class ShoppingDemo {
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.itemName = "Laptop";
        i1.price = 50000;
        i1.quantity = 1;

        Item i2 = new Item();
        i2.itemName = "Mouse";
        i2.price = 800;
        i2.quantity = 2;

        int total1 = i1.price * i1.quantity;
        int total2 = i2.price * i2.quantity;

        System.out.println(i1.itemName + " total = " + total1);
        System.out.println(i2.itemName + " total = " + total2);
    }
}

class ShoppingCart {
    private int total = 0;

    public void addItem(String item, int price) {
        total += price;
        System.out.println("Item added: " + item + " | Price: " + price);
    }

    public void removeItem(String item, int price) {
        total -= price;
        System.out.println("Item removed: " + item + " | Price: " + price);
    }

    public void showTotal() {
        System.out.println("Cart total: " + total);
    }
}

public class Test4 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Shoes", 1000);
        cart.addItem("T-Shirt", 1500);
        cart.showTotal();
        cart.removeItem("Shoes", 1000);
        cart.showTotal();
    }
}

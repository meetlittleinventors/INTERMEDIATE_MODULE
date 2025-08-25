abstract class FoodItem {
    String name;
    double price;
    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract void prepare();
    void deliver() {
        System.out.println(name + " is delivered to your address.");
    }
}

class Pizza extends FoodItem {
    Pizza(String name, double price) {
        super(name, price);
    }
    void prepare() {
        System.out.println("Preparing Pizza: " + name + " with cheese and toppings.");
    }
}

class Burger extends FoodItem {
    Burger(String name, double price) {
        super(name, price);
    }
    void prepare() {
        System.out.println("Preparing Burger: " + name + " with sauces and fries.");
    }
}

class Drink extends FoodItem {
    Drink(String name, double price) {
        super(name, price);
    }
    void prepare() {
        System.out.println("Preparing Drink: " + name + " chilled.");
    }
}

public class Main {
    public static void main(String[] args) {
        FoodItem f1 = new Pizza("Margherita", 299);
        FoodItem f2 = new Burger("Veggie Burger", 199);
        FoodItem f3 = new Drink("Coke", 99);

        f1.prepare();
        f1.deliver();

        f2.prepare();
        f2.deliver();

        f3.prepare();
        f3.deliver();
    }
}

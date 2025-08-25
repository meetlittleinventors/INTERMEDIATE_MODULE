import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Before removal: " + fruits);
        fruits.remove("Apple");
        System.out.println("After removal: " + fruits);
    }
}

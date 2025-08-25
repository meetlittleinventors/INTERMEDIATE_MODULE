import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");

        System.out.println("Initial Cart: " + cart);

        // Add item
        cart.add("Juice");
        System.out.println("After Adding Juice: " + cart);

        // Remove item
        cart.remove("Bread");
        System.out.println("After Removing Bread: " + cart);

        // Check if item exists
        System.out.println("Contains Milk? " + cart.contains("Milk"));

        // Check duplicates
        cart.add("Milk");
        System.out.println("Cart with duplicate: " + cart);
    }
}

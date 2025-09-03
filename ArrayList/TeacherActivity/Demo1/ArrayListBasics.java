import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Declare and create an ArrayList to hold String objects
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the entire list
        System.out.println("Initial List: " + fruits);

        // Access an element by its index (0-based)
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Add a new element at a specific index
        fruits.add(1, "Grape");
        System.out.println("List after adding Grape at index 1: " + fruits);

        // Remove an element by its value
        fruits.remove("Orange");
        System.out.println("List after removing Orange: " + fruits);

        // Iterate through the list using a for-each loop
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

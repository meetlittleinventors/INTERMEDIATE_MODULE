import java.util.ArrayList;

public class ArrayListCapacity {
    public static void main(String[] args) {
        // Create an ArrayList with a default capacity (often 10)
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("Default capacity list created. Size: " + shoppingList.size());

        // Add 10 items. This won't trigger a resize yet.
        for (int i = 0; i < 10; i++) {
            shoppingList.add("Item " + (i + 1));
        }
        System.out.println("After adding 10 items. Size: " + shoppingList.size());

        // The 11th item will force the ArrayList to resize its internal array
        System.out.println("Adding the 11th item...");
        shoppingList.add("Item 11");
        System.out.println("After adding 11th item. Size: " + shoppingList.size());
        
        System.out.println("---");
        
        // You can pre-allocate capacity to avoid costly resizes
        // This is a good practice when you have a good estimate of your data size
        ArrayList<String> knownSizeList = new ArrayList<>(20);
        System.out.println("List with initial capacity of 20 created. Size: " + knownSizeList.size());
        
        // Add elements up to 20 without any resizing overhead
        for (int i = 0; i < 20; i++) {
            knownSizeList.add("Element " + (i + 1));
        }
        System.out.println("After adding 20 elements. Size: " + knownSizeList.size());
        
        // To trim the excess capacity, you can use trimToSize()
        knownSizeList.trimToSize();
        System.out.println("List trimmed to size. Size: " + knownSizeList.size());
    }
}

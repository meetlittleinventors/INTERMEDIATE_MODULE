import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListReverse {

    public static <T> void reverseList(LinkedList<T> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        T firstElement;
        
        // Move elements from the front to the back one by one
        for (int i = 0; i < list.size() - 1; i++) {
            // Remove the first element
            firstElement = list.removeFirst();
            // Add it to the end of the list
            list.addLast(firstElement);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        System.out.println("Original list: " + fruits);
        
        reverseList(fruits);
        
        System.out.println("Reversed list: " + fruits);
    }
}

import java.util.LinkedList;
import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        System.out.println("Original list: " + names);

        if (names.size() > 1) {
            String first = names.removeFirst();
            String last = names.removeLast();
            names.addFirst(last);
            names.addLast(first);
        }

        System.out.println("List after swapping first and last: " + names);
    }
}

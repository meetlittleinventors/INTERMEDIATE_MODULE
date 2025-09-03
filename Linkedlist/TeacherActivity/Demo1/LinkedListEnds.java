import java.util.LinkedList;

public class LinkedListEnds {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Initial list: " + colors);
        
        // Remove the first and last elements
        colors.removeFirst();
        colors.removeLast();
        
        System.out.println("Final list after removals: " + colors);
    }
}

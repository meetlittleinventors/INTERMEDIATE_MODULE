import java.util.ArrayList;

public class ArrayListDynamic {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity of 2 for demonstration
        ArrayList<Integer> numbers = new ArrayList<>(2);
        
        System.out.println("Initial list size: " + numbers.size());
        
        // Add elements, the list will resize behind the scenes
        numbers.add(10);
        numbers.add(20);
        System.out.println("List after 2 additions: " + numbers);
        
        // This third addition will trigger a resize of the underlying array
        numbers.add(30);
        System.out.println("List after 3 additions (triggers resize): " + numbers);
        
        // Add more elements
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Final list: " + numbers);
        System.out.println("Final size: " + numbers.size());
    }
}

import java.util.LinkedList;

public class LinkedListAccess {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("The list is: " + numbers);
        
        if (numbers.contains(20)) {
            System.out.println("The number 20 is present in the list.");
            
            // Accessing first and last elements is efficient
            int firstElement = numbers.getFirst();
            int lastElement = numbers.getLast();
            
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The number 20 is not present in the list.");
        }
    }
}

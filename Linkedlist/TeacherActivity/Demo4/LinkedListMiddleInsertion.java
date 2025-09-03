import java.util.LinkedList;

public class LinkedListMiddleInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Initial list: " + numbers);
        
        int middleIndex = numbers.size() / 2;
        numbers.add(middleIndex, 99);
        
        System.out.println("List after inserting 99 at index " + middleIndex + ": " + numbers);
    }
}

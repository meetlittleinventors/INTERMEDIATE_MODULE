import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        final int numberOfElements = 50000;
        
        // Test ArrayList performance
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        
        long startTime = System.nanoTime();
        // Add to the middle of the ArrayList
        arrayList.add(numberOfElements / 2, 999);
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;
        
        // Test LinkedList performance
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        
        startTime = System.nanoTime();
        // Add to the middle of the LinkedList
        linkedList.add(numberOfElements / 2, 999);
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        System.out.println("--- Insertion in the Middle ---");
        System.out.println("ArrayList Insertion Time: " + arrayListInsertionTime + " ns");
        System.out.println("LinkedList Insertion Time: " + linkedListInsertionTime + " ns");
        System.out.println("Note: LinkedList should be faster here.");
        System.out.println("---");

        // Test random access performance
        startTime = System.nanoTime();
        arrayList.get(numberOfElements / 2);
        endTime = System.nanoTime();
        long arrayListAccessTime = endTime - startTime;
        
        startTime = System.nanoTime();
        linkedList.get(numberOfElements / 2);
        endTime = System.nanoTime();
        long linkedListAccessTime = endTime - startTime;
        
        System.out.println("--- Access by Index ---");
        System.out.println("ArrayList Access Time: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList Access Time: " + linkedListAccessTime + " ns");
        System.out.println("Note: ArrayList is significantly faster here.");
    }
}

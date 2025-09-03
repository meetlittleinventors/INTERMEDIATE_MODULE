import java.util.LinkedList;
import java.util.Arrays;

public class FindMiddleElement {
    public static void main(String[] args) {
        LinkedList<String> evenList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        LinkedList<String> oddList = new LinkedList<>(Arrays.asList("G", "H", "I", "J", "K"));

        System.out.println("Finding middle element of 'evenList'...");
        findMiddle(evenList);
        
        System.out.println("\nFinding middle element of 'oddList'...");
        findMiddle(oddList);
    }

    public static void findMiddle(LinkedList<String> list) {
        // Use two pointers: one 'slow' and one 'fast'
        // The slow pointer moves one step at a time, the fast pointer moves two steps.
        // When the fast pointer reaches the end, the slow pointer will be at the middle.
        
        if (list == null || list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Iterator<String> slow = list.iterator();
        Iterator<String> fast = list.iterator();
        String middleElement = slow.next();

        while (fast.hasNext()) {
            fast.next();
            if (fast.hasNext()) {
                fast.next();
                middleElement = slow.next();
            }
        }
        
        System.out.println("The list is: " + list);
        System.out.println("The middle element is: " + middleElement);
    }
}

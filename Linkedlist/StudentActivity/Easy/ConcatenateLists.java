import java.util.LinkedList;

public class ConcatenateLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);

        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);

        // Add all elements from list2 to the end of list1
        list1.addAll(list2);

        System.out.println("Combined list: " + list1);
    }
}

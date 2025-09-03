import java.util.ArrayList;
import java.util.Collections;

public class MergeAndSort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(8);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(7);

        // Merge the two lists
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("Merged list before sorting: " + mergedList);

        // Sort the merged list
        Collections.sort(mergedList);

        System.out.println("Merged list after sorting: " + mergedList);
    }
}

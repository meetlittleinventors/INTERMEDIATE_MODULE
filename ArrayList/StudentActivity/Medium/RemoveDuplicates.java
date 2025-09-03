import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Blue");
        originalList.add("Green");
        originalList.add("Red");
        originalList.add("Yellow");
        originalList.add("Blue");

        ArrayList<String> uniqueList = new ArrayList<>();
        
        for (String element : originalList) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        System.out.println("Original list with duplicates: " + originalList);
        System.out.println("New list with unique elements: " + uniqueList);
    }
}

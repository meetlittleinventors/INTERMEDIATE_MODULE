import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVsArray {
    public static void main(String[] args) {
        System.out.println("--- Using ArrayList ---");
        ArrayList<String> arrayListNames = new ArrayList<>();
        arrayListNames.add("Alice");
        arrayListNames.add("Bob");
        
        System.out.println("Original ArrayList: " + arrayListNames);
        
        // Adding a new element is simple
        arrayListNames.add("Charlie");
        System.out.println("ArrayList after adding Charlie: " + arrayListNames);
        
        System.out.println("\n--- Using Fixed-Size Array ---");
        String[] arrayNames = new String[2];
        arrayNames[0] = "Alice";
        arrayNames[1] = "Bob";
        
        System.out.println("Original Array: " + Arrays.toString(arrayNames));
        
        // To add a new element, you must manually create a new array
        // This will result in an ArrayIndexOutOfBoundsException if you try to add directly
        try {
            arrayNames[2] = "Charlie"; // This will cause an error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Cannot add to a fixed-size array. Manually resizing is needed.");
        }
        
        // Correct way to "resize" a traditional array
        String[] newArrayNames = new String[3];
        System.arraycopy(arrayNames, 0, newArrayNames, 0, arrayNames.length);
        newArrayNames[2] = "Charlie";
        System.out.println("New array after manual resize: " + Arrays.toString(newArrayNames));
    }
}

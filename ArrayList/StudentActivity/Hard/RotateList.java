import java.util.ArrayList;
import java.util.Arrays;

public class RotateList {

    public static void rotateRight(ArrayList<Integer> list, int steps) {
        if (list == null || list.size() == 0) {
            return;
        }

        int size = list.size();
        // The effective number of steps is steps modulo size, to handle
        // rotations greater than the list size.
        int effectiveSteps = steps % size;

        // Perform the rotation "effectiveSteps" times
        for (int i = 0; i < effectiveSteps; i++) {
            // Remove the last element
            int lastElement = list.remove(size - 1);
            // Insert it at the beginning
            list.add(0, lastElement);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int steps = 2;

        System.out.println("Original list: " + numbers);
        System.out.println("Rotating by " + steps + " steps...");
        
        rotateRight(numbers, steps);
        
        System.out.println("List after rotation: " + numbers);
    }
}

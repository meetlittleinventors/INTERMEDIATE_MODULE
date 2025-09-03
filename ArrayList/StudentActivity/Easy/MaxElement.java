import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(8);
        numbers.add(22);
        numbers.add(10);
        numbers.add(30);

        // Find the maximum element using Collections.max()
        int max = Collections.max(numbers);
        
        System.out.println("The numbers in the list are: " + numbers);
        System.out.println("The maximum number in the list is: " + max);
    }
}

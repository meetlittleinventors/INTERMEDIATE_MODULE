import java.util.*;
import java.util.stream.*;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23);

        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compare);

        if (max.isPresent()) {
            System.out.println("Maximum number = " + max.get());
        } else {
            System.out.println("List is empty!");
        }
    }
}

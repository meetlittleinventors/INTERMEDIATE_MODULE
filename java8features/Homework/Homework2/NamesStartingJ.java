import java.util.*;
import java.util.stream.*;

public class NamesStartingJ {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "James", "Priya", "Jack");

        names.stream()
             .filter(name -> name.startsWith("J"))
             .forEach(System.out::println);
    }
}

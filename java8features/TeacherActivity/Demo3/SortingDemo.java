import java.util.*;
import java.util.stream.*;

public class SortingDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata");

        cities.stream()
              .sorted()
              .forEach(System.out::println);
    }
}

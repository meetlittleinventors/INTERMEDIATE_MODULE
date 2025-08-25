import java.util.*;
import java.util.stream.*;

public class UpperCaseDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amit", "neha", "rohit", "priya");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

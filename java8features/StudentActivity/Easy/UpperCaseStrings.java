import java.util.*;
import java.util.stream.*;

public class UpperCaseStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda", "code");

        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

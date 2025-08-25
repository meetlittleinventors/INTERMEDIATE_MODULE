import java.util.*;
import java.util.stream.*;

public class WordCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

        long count = words.stream()
                          .filter(w -> w.startsWith("a"))
                          .count();

        System.out.println("Words starting with 'a': " + count);
    }
}

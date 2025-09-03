import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class RemoveWithIterator {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Hello", "World", "Java", "Programming", "Code"));
        System.out.println("Original list: " + words);

        // Use an Iterator to safely remove elements during iteration
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.toLowerCase().contains("o")) {
                iterator.remove();
            }
        }
        
        System.out.println("List after removing words with 'o': " + words);
    }
}

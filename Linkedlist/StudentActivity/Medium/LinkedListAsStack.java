import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<String> bookStack = new LinkedList<>();
        
        // Push (add to the front) books onto the stack
        bookStack.addFirst("Book A: The Giver");
        bookStack.addFirst("Book B: 1984");
        bookStack.addFirst("Book C: Brave New World");
        
        System.out.println("Initial stack: " + bookStack);
        
        // Pop (remove from the front) books from the stack
        String poppedBook = bookStack.removeFirst();
        System.out.println("Popped: " + poppedBook);
        System.out.println("Stack after one pop: " + bookStack);
        
        poppedBook = bookStack.removeFirst();
        System.out.println("Popped: " + poppedBook);
        System.out.println("Stack after two pops: " + bookStack);
    }
}

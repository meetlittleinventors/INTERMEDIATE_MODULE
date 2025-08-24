class Book {
    String title;
    String author;
    String status;
    
    // Constructor
    Book(String t, String a, String s) {
        title = t;
        author = a;
        status = s;
    }
    
    void borrowBook() {
        status = "Borrowed";
    }
    
    void display() {
        System.out.println("Book: " + title + ", Author: " + author + ", Status: " + status);
    }
}

public class Medium2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Amit", "Available");
        Book b2 = new Book("Python Guide", "Neha", "Available");
        
        b2.borrowBook();
        
        b1.display(); // Output: Book: Java Basics, Author: Amit, Status: Available
        b2.display(); // Output: Book: Python Guide, Author: Neha, Status: Borrowed
    }
}

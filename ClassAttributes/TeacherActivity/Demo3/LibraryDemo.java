class Book {
    String title;
    String author;
    boolean isAvailable = true;
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James";

        Book b2 = new Book();
        b2.title = "OOP Concepts";
        b2.author = "Smith";

        b2.isAvailable = false; // borrowed

        System.out.println(b1.title + " available: " + b1.isAvailable);
        System.out.println(b2.title + " available: " + b2.isAvailable);
    }
}

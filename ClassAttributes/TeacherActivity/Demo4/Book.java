class Book {
    String title;
    String author;
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "Java Basics";
        b1.author = "James";

        b2.title = "Python Essentials";
        b2.author = "Guido";

        System.out.println(b1.title + " by " + b1.author);
        System.out.println(b2.title + " by " + b2.author);
    }
}

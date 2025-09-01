class Book {
    String title;
    int price;

    Book(String t) {
        title = t;
        price = 0; // default
    }

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println(title + " costs " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP in Java", 500);

        b1.display();
        b2.display();
    }
}

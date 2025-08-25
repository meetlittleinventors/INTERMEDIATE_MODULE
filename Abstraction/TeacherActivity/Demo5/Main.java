abstract class LibraryItem {
    String title;
    LibraryItem(String t) {
        title = t;
    }

    abstract void borrowItem();
    abstract void returnItem();
}

class Book extends LibraryItem {
    Book(String t) { super(t); }

    void borrowItem() {
        System.out.println("Book borrowed: " + title);
    }
    void returnItem() {
        System.out.println("Book returned: " + title);
    }
}

class Magazine extends LibraryItem {
    Magazine(String t) { super(t); }

    void borrowItem() {
        System.out.println("Magazine borrowed: " + title);
    }
    void returnItem() {
        System.out.println("Magazine returned: " + title);
    }
}

class DVD extends LibraryItem {
    DVD(String t) { super(t); }

    void borrowItem() {
        System.out.println("DVD borrowed: " + title);
    }
    void returnItem() {
        System.out.println("DVD returned: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("Java Programming");
        item1.borrowItem();
        item1.returnItem();

        LibraryItem item2 = new Magazine("Tech Monthly");
        item2.borrowItem();

        LibraryItem item3 = new DVD("Inception Movie");
        item3.borrowItem();
    }
}

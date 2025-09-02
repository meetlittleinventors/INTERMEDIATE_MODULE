class Library {
    private int availableBooks = 10;

    public void issueBook() {
        if (availableBooks > 0) {
            availableBooks--;
            System.out.println("Book issued → Available books: " + availableBooks);
        } else {
            System.out.println("No books available");
        }
    }

    public void returnBook() {
        availableBooks++;
        System.out.println("Book returned → Available books: " + availableBooks);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.issueBook();
        lib.returnBook();
    }
}

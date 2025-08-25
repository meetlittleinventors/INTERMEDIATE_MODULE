import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeBook = sc.nextLine();
                    if(books.remove(removeBook)) {
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchBook = sc.nextLine();
                    if(books.contains(searchBook)) {
                        System.out.println("Book is available!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.println("Books in Library: " + books);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

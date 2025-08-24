class Book {
    private String title;
    private double price;

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setPrice(double price) {
        if(price >= 0) this.price = price;
        else System.out.println("Invalid price!");
    }
    public double getPrice() { return price; }
}

public class Main4 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setPrice(500);
        b.setPrice(-50); // Invalid
        System.out.println("Book: " + b.getTitle() + ", Price: " + b.getPrice());
    }
}

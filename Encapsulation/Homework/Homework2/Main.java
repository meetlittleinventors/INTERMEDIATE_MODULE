class Product {
    private String productName;
    private double price;

    public void setProductName(String productName) { this.productName = productName; }
    public String getProductName() { return productName; }

    public void setPrice(double price) {
        if(price >= 0) this.price = price;
        else System.out.println("Invalid price!");
    }
    public double getPrice() { return price; }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductName("Laptop");
        p.setPrice(50000);
        p.setPrice(-100); // Invalid
        System.out.println("Product: " + p.getProductName() + ", Price: " + p.getPrice());
    }
}

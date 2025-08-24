class Pen {
    String color;
    int price;
}

public class PenDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.price = 10;

        System.out.println("Pen Color: " + p1.color + ", Price: " + p1.price);
    }
}

class Rectangle {
    int length;
    int width;

    // Default constructor
    Rectangle() {
        length = 1;
        width = 1;
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    int perimeter() {
        return 2 * (length + width);
    }
}

public class HomeMedium {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();          // default
        Rectangle r2 = new Rectangle(5, 4);      // parameterized

        System.out.println("Rectangle1 -> Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        System.out.println("Rectangle2 -> Area: " + r2.area() + ", Perimeter: " + r2.perimeter());
    }
}

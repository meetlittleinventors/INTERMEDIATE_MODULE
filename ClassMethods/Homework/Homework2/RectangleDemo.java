class Rectangle {
    int length;
    int width;

    void setDimensions(int l, int w) {
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

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setDimensions(5, 4);
        r2.setDimensions(6, 3);

        System.out.println("Rectangle 1 → Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        System.out.println("Rectangle 2 → Area: " + r2.area() + ", Perimeter: " + r2.perimeter());

        if (r1.area() > r2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.area() > r1.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}

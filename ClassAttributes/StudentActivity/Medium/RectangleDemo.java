class Rectangle {
    int length;
    int width;

    int area() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 4;

        Rectangle r2 = new Rectangle();
        r2.length = 6;
        r2.width = 3;

        int area1 = r1.area();
        int area2 = r2.area();

        System.out.println("Rectangle 1 Area: " + area1);
        System.out.println("Rectangle 2 Area: " + area2);

        if (area1 > area2) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}

class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void displayArea() {
        System.out.println("Area = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(7, 4);

        r1.displayArea();
        r2.displayArea();
    }
}

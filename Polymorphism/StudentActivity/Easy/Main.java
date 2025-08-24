class Shape {
    int area(int length, int breadth) { return length * breadth; }
    int area(int side) { return side * side; }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Rectangle area: " + s.area(5, 10));
        System.out.println("Square area: " + s.area(7));
    }
}

class Shape {
    void draw() { System.out.println("Drawing shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing circle"); }
}
public class Main {
    public static void main(String[] args) {
        Shape[] arr = {new Shape(), new Circle()};
        for(Shape s : arr) s.draw();
    }
}

class MathUtil {
    int multiply(int a, int b) { return a*b; }
    int multiply(int a, int b, int c) { return a*b*c; }
}
public class Main {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println(m.multiply(2,3));
    }
}

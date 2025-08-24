class MathHelper {
    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

public class MathHelperDemo {
    public static void main(String[] args) {
        MathHelper mh = new MathHelper();
        mh.multiply(6, 7);
    }
}

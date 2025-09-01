class Test {
    int x = 5;
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 20;

        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}

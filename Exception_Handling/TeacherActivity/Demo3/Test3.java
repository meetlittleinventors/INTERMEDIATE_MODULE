public class Test3 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception occurred");
        } catch (Exception e) {
            System.out.println("Some other Exception occurred");
        }
    }
}

public class FinallyAlways {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[1]);   // safe access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        } finally {
            System.out.println("Finally block executed no matter what.");
        }
    }
}

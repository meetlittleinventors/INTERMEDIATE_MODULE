public class ArrayCheck {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.println(arr[10]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }
}

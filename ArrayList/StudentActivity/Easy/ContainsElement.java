import java.util.ArrayList;

public class ContainsElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");

        String fruitToFind = "Banana";
        
        if (fruits.contains(fruitToFind)) {
            System.out.println(fruitToFind + " is in the list.");
        } else {
            System.out.println(fruitToFind + " is not in the list.");
        }
    }
}

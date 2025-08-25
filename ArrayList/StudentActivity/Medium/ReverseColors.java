import java.util.ArrayList;

public class ReverseColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Colors in reverse order:");
        for(int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }
}

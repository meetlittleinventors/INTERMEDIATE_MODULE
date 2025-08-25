import java.io.*;

public class CountJavaWord {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\W+");
            for (String w : words) {
                if (w.equalsIgnoreCase("Java")) {
                    count++;
                }
            }
        }
        br.close();
        System.out.println("Word 'Java' appears: " + count + " times");
    }
}

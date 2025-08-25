import java.io.*;

public class ReadGreeting {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("greeting.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

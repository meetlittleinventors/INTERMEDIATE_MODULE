import java.io.*;

public class LineCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("story.txt"));
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        System.out.println("Total lines in file: " + count);
    }
}

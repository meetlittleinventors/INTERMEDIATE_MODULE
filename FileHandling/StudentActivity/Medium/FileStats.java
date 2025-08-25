import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("story.txt"));
            String line;
            int lineCount = 0, wordCount = 0, charCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

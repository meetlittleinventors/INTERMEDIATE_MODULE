import java.io.*;
import java.util.*;

public class WordFrequencyStats {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        Map<String, Integer> freq = new HashMap<>();

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String w : words) {
                if (!w.isEmpty())
                    freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }
        br.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        PrintWriter pw = new PrintWriter(new FileWriter("word_stats.csv"));
        pw.println("Word,Frequency");
        for (Map.Entry<String, Integer> e : list) {
            pw.println(e.getKey() + "," + e.getValue());
        }
        pw.close();
    }
}

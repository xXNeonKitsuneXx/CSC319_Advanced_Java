import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class q1_FirstOccurrenceOfTheLongestWordFinder {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("the_sign_of_the_four.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\W+");
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        words.add(token);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(words, new Comparator<String>() {
            public int compare(String a, String b) {
                return b.length() - a.length();
            }
        });

        if (!words.isEmpty()) {
            System.out.println("Longest word: " + words.get(0));
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class q2_FirstOccurrenceOfTheLongestWordFinder {

    public static void main(String[] args) {
        List<String> words = processFile("the_sign_of_the_four.txt", br -> {
            List<String> result = new ArrayList<>();
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    String[] tokens = line.split("\\W+");
                    for (String token : tokens) {
                        if (!token.isEmpty()) {
                            result.add(token);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        });

        words.sort(Comparator.comparingInt(String::length).reversed()); // lambda + method reference

        if (!words.isEmpty()) {
            System.out.println("Longest word: " + words.get(0));
        }
    }

    public static List<String> processFile(String fileName, FileProcessor processor) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return processor.process(br);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @FunctionalInterface
    interface FileProcessor {
        List<String> process(BufferedReader br) throws IOException;
    }
}
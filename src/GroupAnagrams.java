import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> inputWords = getInput();

        Map<String, List<String>> anagrams = groupAnagrams(inputWords);

        printGroupedAnagrams(anagrams);
    }

    public static Map<String, List<String>> groupAnagrams(List<String> input) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : input) {
            String sortedWord = sortString(word);

            anagrams.putIfAbsent(sortedWord, new ArrayList<>());

            anagrams.get(sortedWord).add(word);

        }

        anagrams.values().forEach(Collections::sort);

        return anagrams;
    }

    private static void printGroupedAnagrams(Map<String, List<String>> anagrams) {
        for (List<String> words : anagrams.values()) {
            System.out.println(String.join(" ", words));
        }
    }

    private static List<String> getInput() {
        List<String> words = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("input-files/input.txt"))) {

            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();

                if (!word.isEmpty()) {
                    words.add(word);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }

    private static String sortString(String str) {
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}
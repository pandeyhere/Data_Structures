package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class SubstrWithConcatOfAllWords {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String words[] = new String[] { "foo", "bar" };

        List<Integer> result = findSubstring(s, words);

        for (int index : result) {
            System.out.println(index);
        }
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indexes = new ArrayList<>();
        String searchTerm = words[0];
        if (s.contains(searchTerm)) {
            String[] substrings = s.split(searchTerm);

            for (String str : substrings) {
                for (String word : words) {
                    if (str.equals(word)) {

                    }
                }
            }
        }

        return indexes;
    }
}

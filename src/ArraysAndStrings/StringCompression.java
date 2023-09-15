package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

    public static void main(String[] args) {
        String s = "aaabccccaaaddd";

        String compressedString = compress(s);
        System.out.println(compressedString);
    }

    private static String compress(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

}

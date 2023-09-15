package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() > 0) {
            Map<Character, Integer> charIndexMap = new HashMap<>();
            int maxLength = 0;
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                if (charIndexMap.containsKey(s.charAt(i))) {
                    start = Math.max(start, charIndexMap.get(s.charAt(i)) + 1);
                }
                charIndexMap.put(s.charAt(i), i);
                maxLength = Math.max(maxLength, i - start + 1);

            }

            return maxLength;
        }

        return 0;
    }

}

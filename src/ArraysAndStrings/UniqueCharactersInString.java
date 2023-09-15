package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersInString {

    public static void main(String[] args) {
        String s = "ManishPandey";
        boolean result = uniqueCharactersInStringBruteForce(s);
        boolean result2 = uniqueCharactersInString(s);
        boolean result3 = uniqueCharactersInStringWithoutDS(s);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static boolean uniqueCharactersInStringBruteForce(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean uniqueCharactersInString(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                return false;
            }
            charMap.put(s.charAt(i), 1);
        }
        return true;
    }

    public static boolean uniqueCharactersInStringWithoutDS(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                return false;
            }
        }
        return true;

    }

}

package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IsPossiblePermutationPalindrome {

    public static void main(String[] args) {
        String s = "Manish";
        boolean result = checkIfPermutationPalindrome(s);
        System.out.println(result);
    }

    private static boolean checkIfPermutationPalindrome(String str) {
        int countWithOddDups = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        for (Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                countWithOddDups++;
            }
        }

        if (countWithOddDups > 1) {
            return false;
        }

        return true;

    }

}

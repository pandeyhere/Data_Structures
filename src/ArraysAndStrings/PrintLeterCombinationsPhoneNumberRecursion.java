package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintLeterCombinationsPhoneNumberRecursion {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();

        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        printCombinationsRecursion("23", result, "", 0, map);

        for (String str : result) {
            System.out.println(str);
        }

    }

    private static void printCombinationsRecursion(String digits, List<String> result, String currentCombination,
            int index, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(currentCombination);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            printCombinationsRecursion(digits, result, currentCombination + letters.charAt(i), index + 1, map);
        }

    }

}

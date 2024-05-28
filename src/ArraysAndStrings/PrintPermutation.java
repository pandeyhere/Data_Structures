package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class PrintPermutation {

    public static void main(String[] args) {

        String s = "ADG";
        Set<String> uniquePermutations = new HashSet<>();
        printPermutation(s, "", uniquePermutations);
        for (String str : uniquePermutations) {
            System.out.println(str);
        }

    }

    private static void printPermutation(String s, String result, Set<String> uniquePermutations) {
        if (s.length() == 0) {
            uniquePermutations.add(result);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String qLeft = s.substring(0, i);
            String qRight = s.substring(i + 1);
            printPermutation(qLeft + qRight, result + ch, uniquePermutations);
        }
    }

}

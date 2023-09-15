package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groupedIterative = groupAnagrams(strs);
        groupAnagramsRecursive(strs, 0, result, temp);

        for (List<String> group : groupedIterative) {
            for (String str : group) {
                System.out.print(str);
            }
            System.out.println();
        }

    }

    private static void groupAnagramsRecursive(String[] strs, int index, List<List<String>> result, List<String> temp) {

        if (index == strs.length - 1) {
            result.add(temp);
        }

        for (int i = index; i < strs.length; i++) {
            if (isAnagramPresent(strs[i], temp)) {
                temp.add(strs[i]);
                groupAnagramsRecursive(strs, index + 1, result, temp);
                temp.remove(temp.size() - 1);
            }

        }
    }

    private static boolean isAnagramPresent(String str1, List<String> temp) {
        return areAnagram(str1.toCharArray(), temp.get(0).toCharArray());
    }

    static boolean areAnagram(char str1[], char str2[]) {
        // Create 2 count arrays and initialize
        // all values as 0
        int count1[] = new int[256];
        Arrays.fill(count1, 0);
        int count2[] = new int[256];
        Arrays.fill(count2, 0);
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;

        // Compare count arrays
        for (i = 0; i < 256; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (anagramsMap.containsKey(sortedStr)) {
                List<String> existingList = anagramsMap.get(sortedStr);
                existingList.add(str);
                anagramsMap.put(sortedStr, existingList);
            } else {
                List<String> anagramsList = new ArrayList<>();
                anagramsList.add(str);
                anagramsMap.put(sortedStr, anagramsList);
            }

        }

        // iterate through the map and add tlist ot the list

        for (Entry<String, List<String>> entry : anagramsMap.entrySet()) {
            result.add(entry.getValue());
        }
        return result;

    }

}

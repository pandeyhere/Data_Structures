package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsByCountingChars {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        GroupAnagramsByCountingChars group = new GroupAnagramsByCountingChars();
        List<List<String>> groups = group.groupAnagrams(new String [] {"eat","tea","tan","ate","nat","bat"});

        for(List<String> strGroup : groups){
                for(String str : strGroup){
                    System.out.print(str + " ");
                }
            System.out.println();
        }
    }
}

package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintLeterCombinationsPhoneNumber {

    public static void main(String[] args) {

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

        List<String> combinations = printCombinations("23", map);

        for (String str : combinations) {
            System.out.println(str);
        }

    }

    private static List<String> printCombinations(String str, Map<Character, String> map) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            strList.add(map.get(ch)); // [abc, def]
        }

        List<String> resultList = combination(strList);
        return resultList;
    }

    static List<String> combination(List<String> strList) {
        List<String> intermittentList = new ArrayList<String>();
        List<String> resultList = new ArrayList<String>();
        for (int i = 0; i < strList.size(); i++) {
            for (char ch : strList.get(i).toCharArray()) {
                if (i == 0) {
                    resultList.add(String.valueOf(ch));
                } else {
                    for (int j = 0; j < resultList.size(); j++) {
                        String first = resultList.get(j);
                        String temp = first + ch;
                        intermittentList.add(temp);
                    }

                }

            }
            resultList = !intermittentList.isEmpty() ? intermittentList : resultList;

        }

        return resultList;
    }

}

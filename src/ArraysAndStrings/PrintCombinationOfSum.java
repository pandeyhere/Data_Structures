package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintCombinationOfSum {

    public static void main(String[] args) {
        String s="ADG";
        List<String> result = new ArrayList<>();
        findCombinations(s,result,"");

        for(String str: result){
            System.out.println(str);
        }

    }

    private static void findCombinations(String s, List<String> result, String combination){
        if(s.isEmpty()){
            result.add(combination);
            return;
        }

        for(int i=0;i<s.length();i++){
            findCombinations(s.substring(0, i)+s.substring(i+1),result,combination+s.charAt(i));
        }
    }

}

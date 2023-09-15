package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PermutationInAString {

    public static void main(String[] args) {
        String input = "oidbcaf";
        String pattern = "abc";
        System.out.println(findIfPermutationInString(input,pattern));
    }

    private static boolean findIfPermutationInString(String input, String pattern) {
        int windowStart =0,matched=0;
        Map<Character,Integer> charFreq = new HashMap<>();
        for(Character ch: pattern.toCharArray())
            charFreq.put(ch,charFreq.getOrDefault(ch,0) + 1);

        for(int windowEnd =0; windowEnd<input.length();windowEnd++){
            Character rightChar = input.charAt(windowEnd);
            if(charFreq.containsKey(rightChar)){
                charFreq.put(rightChar, charFreq.get(rightChar)-1);
                matched++;
            }

            if(matched == charFreq.size())
                return true;

            if(windowEnd >= pattern.length()){
                Character leftChar = input.charAt(windowStart);
                if(charFreq.containsKey(leftChar)){
                    charFreq.put(leftChar,charFreq.get(leftChar)-1);
                    matched--;
                }
                windowStart++;
            }
        }


        return false;
    }
}

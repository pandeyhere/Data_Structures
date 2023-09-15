package ArraysAndStrings;


import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstrOfDistinctChars {

    public static void main(String[] args) {
        System.out.println(LengthOfLongestSubstrOfDistinctChars.lengthOfLongestSubstrDistinctChars("aabccbb"));
        System.out.println(LengthOfLongestSubstrOfDistinctChars.lengthOfLongestSubstrDistinctChars("abbbb"));
        System.out.println(LengthOfLongestSubstrOfDistinctChars.lengthOfLongestSubstrDistinctChars("abccde"));

    }

    public static int lengthOfLongestSubstrDistinctChars (String str){
        int windowStart =0 , maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>();

        for (int windowEnd=0; windowEnd<str.length();windowEnd++){
            Character ch = str.charAt(windowEnd);
            if(charIndexMap.containsKey(ch)){
                windowStart = Math.max(windowStart, charIndexMap.get(ch)+1);

            }
            charIndexMap.put(ch,windowEnd);
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }

        return maxLength;
    }
}

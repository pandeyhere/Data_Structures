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
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (int windowEnd=0; windowEnd<str.length();windowEnd++){
            Character ch = str.charAt(windowEnd);
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);

            while(freqMap.get(ch)>1){
                Character rightCharacter = str.charAt(windowStart);
                freqMap.put(rightCharacter, freqMap.get(rightCharacter)-1);
                if(freqMap.get(rightCharacter)==0){
                    freqMap.remove(rightCharacter);
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }

        return maxLength;
    }
}

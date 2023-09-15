package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstrOfSameChars {

    public static void main(String[] args) {
      System.out.println("Longest Length of repeating Chars is" + LengthOfLongestSubstrOfSameChars.lengthOfLongestSubstrSameChars("aabccbb", 2));
    }

    public static int lengthOfLongestSubstrSameChars(String str, int k){
        int windowStart =0, maxRepeatChars = 0, maxLength = 0;
        Map<Character,Integer> charFequency = new HashMap<Character, Integer>();

        for (int windowEnd =0; windowEnd < str.length(); windowEnd++){
            Character rightChar = str.charAt(windowEnd);
            charFequency.put(rightChar, charFequency.getOrDefault(rightChar,0)+1);
            maxRepeatChars = Math.max(maxRepeatChars, charFequency.get(rightChar));

            if(windowEnd-windowStart+1-maxRepeatChars > k ){
                Character leftChar = str.charAt(windowStart);
                charFequency.put(leftChar, charFequency.get(leftChar)-1);
                windowStart ++;


            }

            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}

package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowContainingSubstring {

    public static void main(String[] args) {
        String input = "aabdec";
        String pattern = "abc";
        System.out.println(findIfPermutationInString(input,pattern));
    }

    private static String findIfPermutationInString(String input, String pattern) {
        int windowStart =0,matched=0, minLength=input.length()-1,subStrStart=0;
        Map<Character,Integer> charFreq = new HashMap<>();
        for(Character ch: pattern.toCharArray())
            charFreq.put(ch,charFreq.getOrDefault(ch,0) + 1);

        for(int windowEnd =0; windowEnd<input.length();windowEnd++){
            Character rightChar = input.charAt(windowEnd);
            if(charFreq.containsKey(rightChar)){
                charFreq.put(rightChar, charFreq.get(rightChar)-1);
                if(charFreq.get(rightChar) >= 0){
                    matched++;
                }
            }




            while(matched ==pattern.length()){
                if(minLength > windowEnd-windowStart+1){
                    minLength = windowEnd-windowStart+1;
                    subStrStart = windowStart;
                }
                Character leftChar = input.charAt(windowStart);
                if(charFreq.containsKey(leftChar)){
                    if(charFreq.get(leftChar) == 0)
                        matched--;
                    charFreq.put(leftChar,charFreq.get(leftChar) + 1);

                }
            }
        }


        return minLength>input.length() ? "" : input.substring(subStrStart, subStrStart+minLength);
    }
}

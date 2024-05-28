package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

class ValidAnagrams {

    private static boolean areValidAnagrams (String s1, String s2 ) {

        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for(int i=0; i< s1.length() ; i++){

            freqMap.put(s1.charAt(i), freqMap.getOrDefault(s1.charAt(i),0)+1);

            freqMap.put(s2.charAt(i), freqMap.getOrDefault(s2.charAt(i),0)-1);

        }

        for(int j=0;j<s1.length();j++){
            if(freqMap.get(s1.charAt(j)) != 0){
                return false;
            }

        }

        return true;


    }

    public static void main (String[] args){

        System.out.println(ValidAnagrams.areValidAnagrams("manish", "hanims"));
        System.out.println(ValidAnagrams.areValidAnagrams("manish", "hanima"));
    }


}


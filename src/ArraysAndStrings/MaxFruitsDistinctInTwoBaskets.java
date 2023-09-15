package ArraysAndStrings;


import java.util.HashMap;
import java.util.Map;

public class MaxFruitsDistinctInTwoBaskets {

    public static void main(String[] args) {
        System.out.println(MaxFruitsDistinctInTwoBaskets.msxFruitDistintInTwoBaskets(new Character[]{'A','B','C','A','C'}));
    }

    public static int msxFruitDistintInTwoBaskets(Character [] arr){
        int windowStart =0, maxFruitDistint = 0;
        Map<Character, Integer> distintFruitMap = new HashMap<Character, Integer>();

        for(int windowEnd =0; windowEnd<arr.length; windowEnd++){
            Character rightFruit = arr[windowEnd];
            distintFruitMap.put(rightFruit,distintFruitMap.getOrDefault(rightFruit,0)+1);
            while(distintFruitMap.size()>2){
                Character leftChar = arr[windowStart++];
                distintFruitMap.put(leftChar,distintFruitMap.get(leftChar)-1);
                if(distintFruitMap.get(leftChar) == 0)
                    distintFruitMap.remove(leftChar);
            }
            maxFruitDistint = Math.max(maxFruitDistint,windowEnd-windowStart+1);
        }

        return maxFruitDistint;

    }
}

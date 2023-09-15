package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

class AllMissingNumbers{

    private static List<Integer> allMissingNumbers(int[] nums){

        int i=0;
        while(i< nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums, i,nums[i]-1);
            } else{
                i++;
            }

        }
        List<Integer> allMissingNumbers = new ArrayList<Integer>();
        for( i=0; i< nums.length;i++){
            if(i+1 != nums[i]){
                allMissingNumbers.add(nums[i]);
            }

        }

        return allMissingNumbers;

    }

    private static void swap(int[] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;

    }


    public static void main (String[] args){

        System.out.println("All Missing numbers are" + AllMissingNumbers.allMissingNumbers(new int[]{2,3,1,8,2,3,5,1}));
    }


}

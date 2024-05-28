package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        FindSubsets.findSubsets(new int[] { 1, 3 },result,0,temp);

        for(List<Integer> list: result){
            System.out.println(list.toString());
        }
    }

    private static void findSubsets(int[] nums, List<List<Integer>> subsets, int index, List<Integer> temp){

        if(index == nums.length){
            subsets.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        findSubsets(nums,subsets,index+1,temp);
        temp.remove(temp.size()-1);
        findSubsets(nums,subsets,index+1,temp);



    }

}

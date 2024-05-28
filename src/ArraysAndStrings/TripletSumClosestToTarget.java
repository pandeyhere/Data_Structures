package ArraysAndStrings;

import java.util.Arrays;

public class TripletSumClosestToTarget {

    private static int findTripletSumClosestToTarget(int[] nums, int targetSum){
        Arrays.sort(nums);

        int smallestDiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;int right=nums.length-1;
            while(left<right){
                int targetDiff = targetSum - nums[i] - nums[left] - nums[right];
                if(targetDiff==0){
                    return targetSum;
                }
                if(Math.abs(targetDiff)<Math.abs(smallestDiff) || Math.abs(targetDiff)==Math.abs(smallestDiff) && targetDiff > smallestDiff){
                    smallestDiff=targetDiff;
                }

                if(targetDiff > 0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return targetSum-smallestDiff;
    }

    public static void main(String[] args) {
        System.out.println(
                TripletSumClosestToTarget.findTripletSumClosestToTarget(new int[] { -1, 0, 2, 3 }, 2));
        System.out.println(
                TripletSumClosestToTarget.findTripletSumClosestToTarget(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(
                TripletSumClosestToTarget.findTripletSumClosestToTarget(new int[] { 1, 0, 1, 1 }, 100));
        System.out.println(
                TripletSumClosestToTarget.findTripletSumClosestToTarget(new int[] { 0, 0, 1, 1, 2, 6 }, 5));
    }
}

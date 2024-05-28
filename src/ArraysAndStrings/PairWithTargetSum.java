package ArraysAndStrings;

public class PairWithTargetSum {

    private static int[] findPairWithTargetSum(int[] nums, int targetSum){
        int i=0;
        int j= nums.length-1;
        while(i<j){
            if(nums[i] + nums[j] == targetSum){
                return new int[]{i,j};
            } else if(nums[i]+nums[j]<targetSum){
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSum.findPairWithTargetSum(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSum.findPairWithTargetSum(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}

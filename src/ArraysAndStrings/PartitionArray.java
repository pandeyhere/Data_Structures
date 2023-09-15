package ArraysAndStrings;

public class PartitionArray {

    public static void main(String[] args) {
        int[] nums = new int[] { 5, 0, 3, 8, 6 };
        int ans = partitionDisjoint(nums);
        System.out.println(ans);
    }

    public static int partitionDisjoint(int[] nums) {
        // start at middle
        int[] leftMax = new int[nums.length];
        int[] rightMin = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            leftMax[i] = max;
        }
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            rightMin[i] = min;

        }

        for (int i = 1; i < nums.length; i++) {
            if (leftMax[i - 1] <= rightMin[i]) {
                return i;
            }

        }

        return nums.length;

    }

}

package ArraysAndStrings;

public class MaxSumSubArrayOfSizeK {

    public static int findMaxSumSubArray(int k, int[] arr){
        int maxSum = 0, windowSum=0;
        int windowStart =0;

        for(int windowEnd = 0; windowEnd<=k-1;windowEnd++){
            windowSum += arr[windowEnd];

            if(windowEnd-windowStart+ 1 >= k){
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}

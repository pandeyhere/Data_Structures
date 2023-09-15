package ArraysAndStrings;

public class FindSmallestContiguousSubArray {

    public static void main(String[] args) {
        int [] arr = {2,1,5,2,3,2};
        int result = findSmalledContiguousSubArrayWithSumK(arr, 7);
        System.out.println(result);
    }

    private static int findSmalledContiguousSubArrayWithSumK(int [] arr, int k){
        int windowStart =0, minlength = Integer.MAX_VALUE;
        int windowSum =0;

        for(int windowEnd =0; windowEnd< arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            while(windowSum>=k){
                minlength = Math.min(minlength, windowEnd-windowStart+1);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }


            return minlength;
    }


}

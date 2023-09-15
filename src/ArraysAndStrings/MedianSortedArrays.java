package ArraysAndStrings;

public class MedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 3, 5 };
        int[] nums2 = new int[] { 2, 4, 6 };

        int median = findMedian(nums1, nums2);
        System.out.println(median);

    }

    private static int findMedian(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int lesserLen;
        int greaterLen;
        if (nums1.length > nums2.length) {
            lesserLen = nums2.length;
            greaterLen = nums1.length;
        } else {
            lesserLen = nums1.length;
            greaterLen = nums2.length;

        }
        int i;
        int j;
        int k = 0;
        for (i = 0, j = 0; i < lesserLen - 1;) {
            if (nums1[i] <= nums2[i]) {
                mergedArray[i] = nums1[i];
                i++;
            } else {
                mergedArray[i] = nums2[j];
                j++;
            }
        }
        // for (int k = j; k < greaterLen - 1;) {
        // mergedArray[k]=
        // }
        if (mergedArray.length % 2 == 0) {
            return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2 + 1]) / 2;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }

}

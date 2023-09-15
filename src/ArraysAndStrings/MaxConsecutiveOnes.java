package ArraysAndStrings;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] input = new int[] { 1, 1, 0, 1, 1, 1, 1, 1, 0 };

        System.out.println(maxConsecutiveOnes(input));
    }

    private static int maxConsecutiveOnes(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;
    }

}

package ArraysAndStrings;

public class MaxContinuorsSeriesOnes {

    public static void main(String[] args) {
        int[] input = new int[] { 1, 1, 0, 1, 1, 0, 1, 1, 0 };

        System.out.println(maxContinuosSeriesOnes(input, 1));
    }

    private static int maxContinuosSeriesOnes(int[] input, int flips) {

        int count = 0;
        int ans = 0;
        int j = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                count++;
            }
            while (count > flips) {
                j++;
                if (input[j] == 0) {
                    count--;
                }
            }
            int len = i - j;
            if (len > ans) {
                ans = len;
            }
        }
        return ans;
    }

}

package ArraysAndStrings;

import java.lang.Math;

public class checkMaxIndexDiff {

    public static void main(String[] args) {
        int arr[] = { 34, 91, 44, 3, 2, 80, 30, 33, 1 };
        int diff = maxDiffIndex(arr);
        System.out.println(diff);
        int optimalDiff = maxDiffIndexOptimal(arr);
        System.out.println(optimalDiff);
    }

    private static int maxDiffIndex(int[] arr) {
        int finalMax = 0;
        int intermediateMax = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length - 1; j > arr.length / 2; j--) {
                if (arr[i] < arr[j]) {
                    intermediateMax = j - i;
                    break;
                }
            }
            if (intermediateMax > finalMax) {
                finalMax = intermediateMax;
            }
        }
        return finalMax;

    }

    private static int maxDiffIndexOptimal(int[] arr) {
        int n = arr.length;
        int i, j;
        int leftMin[] = new int[n];
        int rightMax[] = new int[n];

        leftMin[0] = arr[0];
        for (i = 1; i < n; ++i) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }
        rightMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }
        i = 0;
        j = 0;
        int finalMax = -1;

        while (j < n && i < n) {
            if (leftMin[i] < rightMax[j]) {
                finalMax = Math.max(finalMax, j - i);
                j = j + 1;
            } else {
                i = i + 1;
            }
        }
        return finalMax;
    }

}

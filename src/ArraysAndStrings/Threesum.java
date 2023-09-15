package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

    public static void main(String[] args) {
        int[] candidates = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> choices = threeSum(candidates, 0);

        for (List<Integer> choice : choices) {
            for (Integer ans : choice) {
                System.out.print(ans);
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            for (int j = i + 1, k = candidates.length - 1; j < k;) {
                if (candidates[i] + candidates[j] + candidates[k] == target) {
                    temp.add(candidates[i]);
                    temp.add(candidates[j]);
                    temp.add(candidates[k]);
                    ans.add(temp);
                    break;
                } else if (candidates[i] + candidates[j] + candidates[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }

}

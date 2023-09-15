package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumUnique {

    public static void main(String[] args) {
        int[] candidates = new int[] { 10, 1, 2, 7, 6, 1, 5 };
        List<List<Integer>> choices = combinationSum(candidates, 7);

        for (List<Integer> choice : choices) {
            for (Integer ans : choice) {
                System.out.print(ans);
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> temp = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findNumbers(ans, candidates, target, 0, temp);
        return ans;
    }

    private static void findNumbers(List<List<Integer>> ans, int[] candidates, int target, int index,
            ArrayList<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i == index || candidates[i] != candidates[i - 1]) {
                temp.add(candidates[i]);

                findNumbers(ans, candidates, target - candidates[i], i + 1, temp);

                temp.remove(temp.size() - 1);
            }

        }
    }

}

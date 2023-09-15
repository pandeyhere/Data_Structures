package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {

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

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candidates.length; i++) {
            set.add(candidates[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        findNumbers(ans, list, target, 0, temp);
        return ans;
    }

    private static void findNumbers(List<List<Integer>> ans, List<Integer> list, int target, int index,
            ArrayList<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < list.size(); i++) {

            if (target - list.get(i) >= 0) {
                temp.add(list.get(i));

                findNumbers(ans, list, target - list.get(i), i, temp);

                temp.remove(temp.size() - 1);
            }

        }
    }

}

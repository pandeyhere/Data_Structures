package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithSumZero {

    public static List<List<Integer>> findTripletsSum(int [] arr){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            int first = arr[i];
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            searchPairs(i+1, -first, arr, result);

        }

        return result;

    }

    private static void searchPairs(int start, int target, int[] arr, List<List<Integer>> results){

        int left = start;
        int right = arr.length-1;

        while(left<right){
            int currentSum = arr[left] + arr[right];

            if(currentSum == target){
                results.add(Arrays.asList(-target,arr[left],arr[right]));
                left++;
                right--;
                while(left<right && arr[left]==arr[left-1]){
                    continue;
                }
                while(left<right && arr[right]==arr[right+1]){
                    continue;
                }

            } else if(currentSum<target){
                left++;
            } else{
                right--;
            }

        }


    }

    public static void main(String[] args) {
        System.out.println(TripletsWithSumZero.findTripletsSum(
                new int[] { -3, 0, 1, 2, -1, 1, -2 }));
        System.out.println(TripletsWithSumZero.findTripletsSum(new int[] { -5, 2, -1, -2, 3 }));
    }


}

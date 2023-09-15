package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAnySubsequenceWithSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        List<Integer> subsquence = new ArrayList<Integer>();
        boolean result = printAnySubsequenceWithSum(0,subsquence,2,arr);
    }

    private static boolean  printAnySubsequenceWithSum(int index, List<Integer> subsequence, int sum, int[] arr){
        if(index == arr.length){
            if (sum ==2){
                for(int i: subsequence){
                    System.out.print(i + "");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        subsequence.add(arr[index]);
        if(printAnySubsequenceWithSum(index +1, subsequence,sum+arr[index],arr) == true){
            return true;
        }

        int removeNumber = subsequence.remove(subsequence.size()-1);
        if(printAnySubsequenceWithSum(index+1,subsequence,sum - removeNumber,arr) == true){
            return true;
        }
        return false;
    }
}

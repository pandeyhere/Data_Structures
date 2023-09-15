package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequenceWithASum {

    public static void main(String[] args) {
        int sum =2;
        int[] arr = {1,2,1};
        int length = arr.length;
        List<Integer> subsequence = new ArrayList<Integer>();
        printAllSubsequenceWithSum(0,subsequence,2,arr);
    }

    private static void printAllSubsequenceWithSum(int index, List<Integer> subsequence, int sum, int[] arr){
        if(index == arr.length ){
            if(sum ==2){
                for(int i: subsequence){
                    System.out.print(i + "");
                }
                System.out.println();
                if(subsequence.size() ==0){
                    System.out.println("{}");
                }
            }
            return;
        }
        subsequence.add(arr[index]);
        printAllSubsequenceWithSum(index+1,subsequence,sum+arr[index],arr);
        int removeNumber = subsequence.remove(subsequence.size()-1);
        printAllSubsequenceWithSum(index+1,subsequence,sum-removeNumber,arr);

    }

}

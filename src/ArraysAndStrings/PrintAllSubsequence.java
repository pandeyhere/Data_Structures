package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int len = arr.length;
        ArrayList<Integer> subsequenceList = new ArrayList<Integer>();
        printAllSubsequence(0, subsequenceList, arr);
    }

    private static void printAllSubsequence(int index, List<Integer> subsequence, int[] arr){
        if(index == arr.length){
            for(int i: subsequence){
                System.out.print(i + "");
            }
            if(subsequence.size() == 0){
                System.out.print( "{}");
            }
            System.out.println("\n");
            return;
        }
        subsequence.add(arr[index]);
        printAllSubsequence(index+1,subsequence,arr);
        subsequence.remove(subsequence.size()-1);
        printAllSubsequence(index+1,subsequence,arr);
    }
}

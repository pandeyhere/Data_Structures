package ArraysAndStrings;

import java.util.Arrays;

public class CountTriplets {

    public static int countTriplets(int[] arr, int target){

        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<arr.length-2;i++){
            count = count + searchTriplets(i,arr,target-arr[i]);

        }
        return count;

    }

    private static int searchTriplets (int first,int[] arr, int target){
        int count=0;
        int left = first+1;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]<target){
                count=count + right-left;
                left++;
            }else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
                CountTriplets.countTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(
                CountTriplets.countTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }

}

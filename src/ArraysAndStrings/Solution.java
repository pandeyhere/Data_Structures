package ArraysAndStrings;

import java.util.*;

class Entry {
    int key;
    int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {

    public static List<Integer> findClosestElements(int[] arr, int K, Integer X) {
        int index = binarySearch(arr,X);
        int low = index- K; int high = index + K;
        low = Math.min(0,low);
        high = Math.max(arr.length-1,high);

        PriorityQueue<Entry> minHeap = new PriorityQueue<>((n1, n2) -> n1.key - n2.key);

        for(int i=low;i<=high;i++){
            minHeap.offer(new Entry(Math.abs(arr[i]-X),i));
        }



        List<Integer> result = new ArrayList<>();

        for(int i=0;i<K;i++){
            result.add(arr[minHeap.poll().value]);
        }
        Collections.sort(result);
        return result;
    }

    private static int binarySearch(int[] arr, int k){

        int low=0; int high = arr.length;
        while(low<high){
            int mid = low + (high-low)/2;
            if( arr[mid] == k){
                return mid;
            }else if(arr[mid]<k){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        if (low > 0) {
            return low - 1;
        }
        return low;

    }

    public static void main(String[] args) {
        List<Integer> result =
                Solution.findClosestElements(new int[] { 5, 6, 7, 8, 9 }, 3, 7);
        System.out.println("'K' closest numbers to 'X' are: " + result);

        result = Solution.findClosestElements(new int[] { 2, 4, 5, 6, 9 }, 3, 6);
        System.out.println("'K' closest numbers to 'X' are: " + result);

        result = Solution.findClosestElements(new int[] { 2, 4, 5, 6, 9 }, 3, 10);
        System.out.println("'K' closest numbers to 'X' are: " + result);
    }
}


package ArraysAndStrings;

public class BinarySearch {

    public static void main(String[] args) {
        int sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        boolean found = binarySearch(sortedArray, 12);
        System.out.println(found);
    }

    private static boolean binarySearch(int[] sortedArray, int number) {
        int start = 0;
        int end = sortedArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (sortedArray[mid] == number) {
                return true;
            } else if (sortedArray[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return false;
    }

}

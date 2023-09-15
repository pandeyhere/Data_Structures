package ArraysAndStrings;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        boolean found = binarySearchRecursion(sortedArray, 0, sortedArray.length - 1, 6);
        System.out.println(found);
    }

    private static boolean binarySearchRecursion(int[] sortedArray, int start, int end, int number) {

        int mid = start + (end - start) / 2;
        if (end < start) {
            return false;
        }
        if (sortedArray[mid] == number) {
            return true;
        } else if (sortedArray[mid] < number) {
            return binarySearchRecursion(sortedArray, mid + 1, end, number);
        } else {
            return binarySearchRecursion(sortedArray, start, mid - 1, number);

        }
    }

}

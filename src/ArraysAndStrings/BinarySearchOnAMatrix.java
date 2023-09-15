package ArraysAndStrings;

public class BinarySearchOnAMatrix {

    public static void main(String[] args) {
        int sortedMatrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        boolean found = binarySearchOnMatrix(sortedMatrix, 3);
        System.out.println(found);

    }

    private static boolean binarySearchOnMatrix(int[][] sortedMatrix, int i) {
        int length = sortedMatrix.length;
        int width = sortedMatrix[0].length;
        int start = 0;
        int end = width * length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int x = mid / width;
            int y = mid % width;
            if (sortedMatrix[x][y] == i) {
                return true;
            } else if (sortedMatrix[x][y] < i) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }

}

package ArraysAndStrings;

public class ZeroMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 0, 3 }, { 4, 5, 6 }, { 0, 8, 9 } };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("---------------");

        int changedMatrix[][] = changeToZeroMatrix(matrix);

        for (int i = 0; i < changedMatrix.length; i++) {
            for (int j = 0; j < changedMatrix[0].length; j++) {
                System.out.print(changedMatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    private static int[][] changeToZeroMatrix(int[][] matrix) {
        boolean row[] = new boolean[matrix.length];
        boolean column[] = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullifyRows(matrix, i);
            }
        }

        for (int i = 0; i < column.length; i++) {
            if (column[i]) {
                nullifyColumns(matrix, i);
            }
        }

        return matrix;
    }

    private static void nullifyColumns(int[][] matrix, int column) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][column] = 0;
        }
    }

    private static void nullifyRows(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }
}

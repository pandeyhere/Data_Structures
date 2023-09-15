package ArraysAndStrings;

public class MazeProblem {

    public static void main(String[] args) {

        String psf = "";
        int[][] arr = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        int[][] visited = new int[arr.length][arr[0].length];
        int sr = 0;
        int sc = 0;
        int dr = arr.length - 1;
        int dc = arr[0].length - 1;

        printMaze(arr, visited, sr, sc, dr, dc, psf);
    }

    private static void printMaze(int[][] arr, int[][] visited, int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc && arr[dr][dc] == 1) {
            System.out.println(psf);
        }
        if (sc + 1 <= dc && arr[sr][sc + 1] == 1 && visited[sr][sc + 1] == 0) {
            visited[sr][sc] = 1;
            printMaze(arr, visited, sr, sc + 1, dr, dc, psf + "R");
            visited[sr][sc] = 0;
        }
        if (sr + 1 <= dr && arr[sr + 1][sc] == 1 && visited[sr + 1][sc] == 0) {
            visited[sr][sc] = 1;
            printMaze(arr, visited, sr + 1, sc, dr, dc, psf + "D");
            visited[sr][sc] = 0;
        }

        if (sr - 1 >= 0 && arr[sr - 1][sc] == 1 && visited[sr - 1][sc] == 0) {
            visited[sr][sc] = 1;
            printMaze(arr, visited, sr - 1, sc, dr, dc, psf + "U");
            visited[sr][sc] = 0;
        }

        if (sc - 1 >= 0 && arr[sr][sc - 1] == 1 && visited[sr][sc - 1] == 0) {
            visited[sr][sc] = 1;
            printMaze(arr, visited, sr, sc - 1, dr, dc, psf + "L");
            visited[sr][sc] = 0;
        }

    }

}

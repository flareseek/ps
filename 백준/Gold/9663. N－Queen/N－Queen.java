import java.io.*;

public class Main {
    static int result = 0;
    static int[][] field;
    static boolean[] rowVisited;
    static boolean[] crossR;
    static boolean[] crossL;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        field = new int[N][N];
        rowVisited = new boolean[N];
        crossR = new boolean[N*2-1];
        crossL = new boolean[N*2-1];

        for (int row = 0; row < N; row ++) {
            rowVisited[row] = true;
            crossR[0+row] = true;
            crossL[0-row+N-1] = true;
            bt(0);
            rowVisited[row] = false;
            crossR[0+row] = false;
            crossL[0-row+N-1] = false;
        }
        System.out.println(result);
        br.close();
    }
    public static void bt(int col) {
        if (col+1 == field.length) {
            result ++;
            return;
        }
        for (int r = 0; r < field.length; r++) {
            if(!rowVisited[r] && !crossR[col+1 + r] && !crossL[col+1 - r + field.length - 1]) {
                rowVisited[r] = true;
                crossR[col+1 + r] = true;
                crossL[col+1 - r + field.length - 1] = true;
                bt(col+1);
                rowVisited[r] = false;
                crossR[col+1 + r] = false;
                crossL[col+1 - r + field.length - 1] = false;
            }
        }
    }
}

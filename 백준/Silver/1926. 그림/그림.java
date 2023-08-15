import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static int step = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int C = Integer.parseInt(st.nextToken());
        final int R = Integer.parseInt(st.nextToken());
        int[][] field = new int[C][R];
        for(int c = 0; c < C; c++) field[c] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        int count = 0;
        for(int c = 0; c < C; c++) {
            for(int r = 0; r < R; r++) {
                if (field[c][r] == 1) {
                    count ++;
                    step = 0;
                    DFS(field, c, r);
                    if (max < step) max = step;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
        br.close();
    }
    public static void DFS(int[][] field, int col, int row) {
        step ++;
        field[col][row] = -1;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for(int i = 0; i < dx.length; i++) {
            int C = col + dy[i];
            int R = row + dx[i];
            if (C < 0 || C >= field.length || R < 0 || R >= field[0].length || field[C][R] != 1) continue;
            DFS(field, C, R);
        }
    }
}

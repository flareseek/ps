import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[][] field = new int[N][N];
        int[] Point = new int[2];
        for (int c = 0; c < N; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int r = 0; r < N; r++) {
                final int b = Integer.parseInt(st.nextToken());
                if (b == 9) {
                    field[c][r] = 0;
                    Point = new int[]{c, r, 0};
                } else field[c][r] = b;
            }
        }
        // U L R, D
        int[] dx = {0, -1, 1, 0};
        int[] dy = {-1, 0, 0, 1};
        int result = 0;
        int sharkSize = 2;
        int sharkEat = 0;
        while (true) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                if (a[2] != b[2]) return a[2] - b[2];
                else if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            });
            boolean[][] visited = new boolean[N][N];
            pq.add(new int[]{Point[0], Point[1], 0});
            visited[Point[0]][Point[1]] = true;
            boolean isEat = false;

            while(!pq.isEmpty()) {
                Point = pq.poll();
                if (field[Point[0]][Point[1]] != 0 && field[Point[0]][Point[1]] < sharkSize) {
                    field[Point[0]][Point[1]] = 0;
                    sharkEat++;
                    result += Point[2];
                    isEat = true;
                    break;
                }
                for (int i = 0; i < dx.length; i++) {
                    int C = Point[0] + dy[i];
                    int R = Point[1] + dx[i];

                    if (C < 0 || C >= N || R < 0 || R >= N || visited[C][R] || field[C][R] > sharkSize) continue;

                    pq.add(new int[]{C, R, Point[2] + 1});
                    visited[C][R] = true;
                }
            }
            if (!isEat) break;
            if (sharkSize == sharkEat) {
                sharkSize ++;
                sharkEat = 0;
            }
        }
        System.out.println(result);
        br.close();
    }
}

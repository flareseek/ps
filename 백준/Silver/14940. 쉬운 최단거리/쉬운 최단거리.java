import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        int[][] field = new int[N][M];
        int[][] distance = new int[N][M];
        Queue<int[]> q = new LinkedList<>();
        for(int c = 0; c < N; c++) {
            st = new StringTokenizer(br.readLine());
            for(int r = 0; st.hasMoreTokens(); r++) {
                int d = Integer.parseInt(st.nextToken());
                field[c][r] =d;
                if (d == 2) q.add(new int[]{c, r});
                if (d == 1) distance[c][r] = -1;
                if (d == 0) distance[c][r] = 0;
            }
        }
        int dis = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-->0) {
                int[] P = q.poll();
                distance[P[0]][P[1]] = dis;
                for(int i = 0; i < dx.length; i++) {
                    int C = P[0] + dy[i];
                    int R = P[1] + dx[i];
                    if (C < 0 || C >= N || R < 0 || R >= M || field[C][R] != 1) continue;
                    field[C][R] = -1;
                    q.add(new int[]{C, R});
                }
            }
            dis ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int[] D: distance) {
            for(int d: D) sb.append(d).append(" ");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}

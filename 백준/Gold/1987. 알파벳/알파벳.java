import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int depth = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int C = Integer.parseInt(st.nextToken());
        final int R = Integer.parseInt(st.nextToken());
        char[][] field = new char[C][R];
        boolean[] visited = new boolean['Z' - 'A' + 1];
        for(int c = 0; c < C; c++) field[c] = br.readLine().toCharArray();
        visited[field[0][0] - 'A'] = true;
        bt(field, visited, 0, 0, 1);
        System.out.println(depth);
        br.close();
    }

    static void bt(char[][]field, boolean[] visited, int c, int r, int d) {
        for(int i = 0; i < dx.length; i++) {
            int C = c + dy[i];
            int R = r + dx[i];
            if(C < 0 || C >= field.length || R < 0 || R >= field[0].length || visited[field[C][R] - 'A']) continue;
            visited[field[C][R]-'A'] = true;
            bt(field, visited, C, R, d+1);
            visited[field[C][R]-'A'] = false;
        }
        if (depth < d) depth = d;
    }
}
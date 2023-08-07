import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while(!(str = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(str);
            final int R = Integer.parseInt(st.nextToken());
            final int C = Integer.parseInt(st.nextToken());
            int[][] field = new int[C][R];
            for(int i = 0; i < C; i++) field[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int cnt = 0;
            for(int c = 0; c < C; c++) {
                for(int r = 0; r < R; r++) {
                    if(field[c][r] == 1) {
                        dfs(field, c, r);
                        cnt ++;
                    }
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }
    static void dfs(int[][]field, int C, int R) {
        field[C][R] = -1;
        int[] dx = {1, 0, -1, 0, -1, 1, 1, -1};
        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};
        for(int i = 0; i < dx.length; i++) {
            int c = C+dy[i];
            int r = R+dx[i];
            if(c < 0 || c >= field.length || r < 0 || r >= field[0].length) continue;
            if(field[c][r] == 1) dfs(field, c, r);
        }
    }
}

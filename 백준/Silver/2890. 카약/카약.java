import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int ROW = Integer.parseInt(st.nextToken());
        final int COL = Integer.parseInt(st.nextToken());

        int[][] score = new int[9][2];
        for(int r = 0; r < ROW; r++) {
            char[] str = br.readLine().toCharArray();
            for(int c = 1; c < COL-3; c++) {
                if (str[c] < '0' || '9' < str[c]) continue;
                int TEAM = str[c]-'0';
                score[TEAM-1] = new int[]{COL - c, TEAM};
                break;
            }
        }
        Arrays.sort(score, (v1, v2) -> v1[0] - v2[0]);
        int rank = 0;
        int prev = -1;
        for(int i = 0; i < score.length; i++) {
            if (score[i][0] != prev) rank++;
            prev = score[i][0];
            score[i] = new int[]{score[i][1], rank};
        }
        Arrays.sort(score, (v1, v2) -> v1[0] - v2[0]);

        StringBuilder sb = new StringBuilder();
        for(int[] sc: score) sb.append(sc[1]).append("\n");
        System.out.print(sb);
        br.close();
    }
}
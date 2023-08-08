import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] field = new int[N[0]][N[1]];
        while(N[2]-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sr = Integer.parseInt(st.nextToken());
            int sc = Integer.parseInt(st.nextToken());
            final int er = Integer.parseInt(st.nextToken());
            final int ec = Integer.parseInt(st.nextToken());
            for(int c = sc; c < ec; c++)
                for(int r = sr; r < er; r++)
                    field[c][r] = 1;
        }

        ArrayList<Integer> s = new ArrayList<>();
        for(int c = 0; c < N[0]; c++) {
            for(int r = 0; r < N[1]; r++) {
                if(field[c][r] != 0) continue;
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{c, r});
                field[c][r] = -1;
                int[] dx = {1, 0, -1, 0};
                int[] dy = {0, 1, 0, -1};
                int cnt = 0;
                while(!q.isEmpty()) {
                    cnt ++;
                    int[] P = q.poll();
                    for(int i = 0; i < dx.length; i++) {
                        int col = P[0] + dy[i];
                        int row = P[1] + dx[i];
                        if(col < 0 || col >= N[0] || row < 0 || row >= N[1] || field[col][row] != 0) continue;
                        field[col][row] = -1;
                        q.add(new int[]{col, row});
                    }
                }
               s.add(cnt);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.size()).append("\n");
        Collections.sort(s);
        for(int i: s) sb.append(i).append(" ");
        System.out.print(sb);
        br.close();
    }
}

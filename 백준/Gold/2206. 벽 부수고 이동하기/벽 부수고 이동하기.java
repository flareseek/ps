import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int COL = Integer.parseInt(st.nextToken());
    final int ROW = Integer.parseInt(st.nextToken());

    int[][] field = new int[COL][ROW];
    for(int i =0; i < COL; i++) field[i] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
    br.close();

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{0, 0, 0});
    field[0][0] = -1;

    int step = 1;
    while(!q.isEmpty()) {
      int[] dx = {1, 0, -1, 0};
      int[] dy = {0, 1, 0, -1};

      int size = q.size();
      while(size-->0) {
        int[] P = q.poll(); // col, row, check
        if(P[0] == COL-1 && P[1] == ROW-1) {
          System.out.println(step);
          return;
        }
        for(int i = 0; i < dx.length; i++) {
          int c = P[0] + dy[i];
          int r = P[1] + dx[i];
          if (c < 0 || c >= COL || r < 0 || r >= ROW) continue;
          if(field[c][r] == 1 && P[2] == 0) {
            field[c][r] = -1;
            q.add(new int[]{c, r, 1});
          }
          else if(P[2] == 0) {
            if(field[c][r] == 0 || field[c][r] == -2) {
              field[c][r] = -1;
              q.add(new int[]{c, r, 0});
            }
          } else if(P[2] == 1) {
            if(field[c][r] == 0) {
              field[c][r] = -2;
              q.add(new int[]{c, r, 1});
            }
          }
        }
      }
      step ++;
    }
    System.out.println(-1);
  }
}
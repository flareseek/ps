import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    while (N-- > 0) {
      final int w = Integer.parseInt(br.readLine());
      boolean[][] visited = new boolean[w][w];
      int[] start = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] goal = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      visited[start[0]][start[1]] = true;
      Queue<int[]> q = new LinkedList<>();
      q.add(start);

      int lv = 0;
      int[] dx = {-1, -1, 1, 1, -2, -2, 2, 2};
      int[] dy = {-2, 2, -2, 2, -1, 1, -1, 1};
      while (!q.isEmpty()) {
        int size = q.size();
        while (size-- > 0) {
          int[] P = q.poll();
          if (P[0] == goal[0] && P[1] == goal[1]) {
            sb.append(lv).append("\n");
            q.clear();
            break;
          }
          for (int i = 0; i < dx.length; i++) {
            int col = P[0] + dy[i];
            int row = P[1] + dx[i];
            if (0 <= col && col < w && 0 <= row && row < w && !visited[col][row]) {
              visited[col][row] = true;
              q.add(new int[]{col, row});
            }
          }
        }
        lv++;
      }
    }
    System.out.print(sb);
    br.close();
  }
}
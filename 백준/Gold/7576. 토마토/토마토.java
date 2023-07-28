import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int row = Integer.parseInt(st.nextToken());
    int col = Integer.parseInt(st.nextToken());
    int[][] field = new int[col][row];
    int tomato = row*col;

    Queue<int[]> q = new LinkedList<>();
    for (int c = 0; c < col; c++) {
      int r = 0;
      st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        int t = Integer.parseInt(st.nextToken());
        if (t == 1) q.add(new int[]{c, r});
        else if (t == -1) tomato --;
        field[c][r++] = t;
      }
    }
    int day = 0;
    int n = 0;
    int[] dx = {1, 0, -1, 0}; // R D L U
    int[] dy = {0, 1, 0, -1};
    while (!q.isEmpty()) {
      n ++;
      int[] P = q.poll();
      day = field[P[0]][P[1]];
      for (int i = 0; i < dx.length; i++) {
        int c = P[0] + dy[i];
        int r = P[1] + dx[i];
        if (c < 0 || c >= col || r < 0 || r >= row || field[c][r] != 0) continue;
        field[c][r] = field[P[0]][P[1]] + 1;
        q.add(new int[]{c, r});
      }
    }
    if (tomato != n) System.out.println(-1);
    else System.out.println(day-1);
    br.close();
  }
}